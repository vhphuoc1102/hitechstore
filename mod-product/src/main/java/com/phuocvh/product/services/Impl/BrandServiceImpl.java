package com.phuocvh.product.services.Impl;

import com.phuocvh.product.repositories.PmsBrandRepository;
import com.phuocvh.product.entities.PmsBrand;
import com.phuocvh.product.services.BrandService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class BrandServiceImpl implements BrandService {
  private final PmsBrandRepository pmsBrandRepo;

  @Override
  public PmsBrand findBrandByKey(Integer brandId) {
    return pmsBrandRepo.findById(brandId).orElseThrow();
  }
}
