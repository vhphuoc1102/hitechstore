package com.phuocvh.product.services;

import com.phuocvh.product.payloads.requests.product.CreateProductRequest;
import org.springframework.transaction.annotation.Transactional;

public interface ProductService {
  @Transactional(rollbackFor = Exception.class)
  void createProduct(CreateProductRequest request);
}
