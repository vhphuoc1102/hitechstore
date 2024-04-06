package com.phuocvh.product.services.Impl;

import com.phuocvh.product.entities.*;
import com.phuocvh.product.mapstruct.MemberPriceMapper;
import com.phuocvh.product.mapstruct.ProductMapper;
import com.phuocvh.product.payloads.requests.product.CreateProductRequest;
import com.phuocvh.product.repositories.*;
import com.phuocvh.product.services.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
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

  @Override
  public void createProduct(CreateProductRequest request) {
    PmsProduct product = productMapper.toEntity(request);

    PmsCategory category = categoryService.findCategoryById(request.getCategoryId());
    PmsBrand brand = brandService.findBrandByKey(request.getBrandId());
    PmsProdAttrGroup prodAttrGroup =
        attributeService.findAttrGroupByKey(request.getProdAttrGroup());

    product.setCategoryId(category);
    product.setBrandId(brand);
    product.setProdAttrGroupId(prodAttrGroup);

    PmsProduct savedProduct = pmsProductRepo.save(product);

    insertRelation(
        pmsMemberPriceRepo, request.getMemberPriceList(), MemberPriceMapper.INSTANCE, savedProduct);
    insertRelation(
        pmsLadderPriceRepo, request.getLadderPriceList(), PmsLadderPrice.class, savedProduct);
    insertRelation(pmsSkuRepo, request.getSkuList(), PmsSku.class, savedProduct);
    insertRelation(
        pmsProdAttrValueRepo, request.getProdAttrValueList(), PmsProdAttrValue.class, savedProduct);
  }

  private void insertRelation(
      JpaRepository<?, Integer> repo, List<?> dataList, Object mapper, PmsProduct savedProduct) {
    if (dataList == null || dataList.isEmpty()) return;
    List entityList = new ArrayList<>();
    dataList.forEach(
        data -> {
          try {
            Method toEntity = mapper.getClass().getMethod("toEntity", data.getClass());
            Object entity = toEntity.invoke(mapper, data);
            Method setProductId = entity.getClass().getMethod("setProductId", PmsProduct.class);
            setProductId.invoke(entity, savedProduct);
            entityList.add(entity);
          } catch (Exception e) {
            log.warn("Create product error: " + e.getMessage());
            throw new RuntimeException(e.getMessage());
          }
        });
    repo.saveAll(entityList);
  }
}
