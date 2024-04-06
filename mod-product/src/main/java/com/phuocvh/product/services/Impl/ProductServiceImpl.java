package com.phuocvh.product.services.Impl;

import com.phuocvh.product.dtos.LadderPriceWrap;
import com.phuocvh.product.dtos.MemberPriceWrap;
import com.phuocvh.product.dtos.ProdAttrValueWrap;
import com.phuocvh.product.dtos.SkuWrap;
import com.phuocvh.product.entities.*;
import com.phuocvh.product.mapstruct.MemberPriceMapper;
import com.phuocvh.product.mapstruct.ProductMapper;
import com.phuocvh.product.payloads.requests.product.ProductRequest;
import com.phuocvh.product.payloads.responses.product.ProductResponse;
import com.phuocvh.product.repositories.*;
import com.phuocvh.product.services.*;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class ProductServiceImpl implements ProductService {
  private final ProductMapper productMapper;
  private final CategoryService categoryService;
  private final BrandService brandService;
  private final AttributeService attributeService;
  private final PmsProductRepository pmsProductRepo;
  private final PmsLadderPriceRepository pmsLadderPriceRepo;
  private final PmsSkuRepository pmsSkuRepo;
  private final PmsMemberPriceRepository pmsMemberPriceRepo;
  private final PmsProdAttrValueRepository pmsProdAttrValueRepo;
  private final LadderPriceService ladderPriceService;

  @Override
  public void saveProduct(ProductRequest request) {
    PmsProduct product = productMapper.toEntity(request);
    addProductToRelationEntity(product, request);
    PmsProduct savedProduct = pmsProductRepo.save(product);
    addRelationEntityToProduct(request, savedProduct);
  }

  @Override
  public ProductResponse getProduct(Integer productId) {
    PmsProduct product = pmsProductRepo.findById(productId).orElseThrow(EntityNotFoundException::new);
    ProductResponse response = productMapper.toResponse(product);
    response.setLadderPriceIds(ladderPriceService.findIdList(product));

    // TODO: Set relation ids to response.
    // TODO: Install mvnw maven.

    return response;
  }

  private void addProductToRelationEntity(PmsProduct product, ProductRequest request){
    PmsCategory category = categoryService.findCategoryById(request.getCategoryId());
    PmsBrand brand = brandService.findBrandByKey(request.getBrandId());
    PmsProdAttrGroup prodAttrGroup =
        attributeService.findAttrGroupByKey(request.getProdAttrGroup());

    product.setCategoryId(category);
    product.setBrandId(brand);
    product.setProdAttrGroupId(prodAttrGroup);
  }

  private void addRelationEntityToProduct(ProductRequest request, PmsProduct savedProduct){
    insertRelation(
        pmsMemberPriceRepo, request.getMemberPriceList(), MemberPriceMapper.INSTANCE, savedProduct, MemberPriceWrap.class, PmsMemberPrice.class);
    insertRelation(
        pmsLadderPriceRepo, request.getLadderPriceList(), PmsLadderPrice.class, savedProduct, LadderPriceWrap.class, PmsLadderPrice.class);
    insertRelation(pmsSkuRepo, request.getSkuList(), PmsSku.class, savedProduct, SkuWrap.class, PmsSku.class);
    insertRelation(
        pmsProdAttrValueRepo, request.getProdAttrValueList(), PmsProdAttrValue.class, savedProduct, ProdAttrValueWrap.class, PmsProdAttrValue.class);
  }

  private void insertRelation(
      JpaRepository<?, Integer> repo,
      List<?> dataList, Object mapper,
      PmsProduct savedProduct,
      Class<?> sourceClass,
      Class<?> targetClass) {
    if (dataList == null || dataList.isEmpty()) return;
    try{
      List<Object> entityList = new ArrayList<>();
      dataList.forEach(
          data -> {
            try {
              Method toEntity = mapper.getClass().getMethod("toEntity", sourceClass);
              Object entity = toEntity.invoke(mapper, data);
              Method setProductId = entity.getClass().getMethod("setProductId", PmsProduct.class);
              setProductId.invoke(entity, savedProduct);
              entityList.add(entity);
            } catch (Exception e) {
              log.warn("Create product error: " + e.getMessage());
              throw new RuntimeException(e.getMessage());
            }
          });
      Method saveAll = repo.getClass().getMethod("saveAll", targetClass);
      saveAll.invoke(repo, entityList);
    } catch (Exception e){
      log.error("Failed to save " + e.getMessage());
      throw new RuntimeException(e.getMessage());
    }
  }
}
