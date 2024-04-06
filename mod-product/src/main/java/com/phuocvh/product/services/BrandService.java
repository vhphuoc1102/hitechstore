package com.phuocvh.product.services;

import com.phuocvh.product.entities.PmsBrand;

public interface BrandService {
  PmsBrand findBrandByKey(Integer brandId);
}
