package com.phuocvh.product.services;

import com.phuocvh.product.payloads.requests.product.ProductRequest;
import com.phuocvh.product.payloads.responses.product.ProductResponse;
import org.springframework.transaction.annotation.Transactional;

public interface ProductService {
  @Transactional(rollbackFor = Exception.class)
  void saveProduct(ProductRequest request);

  @Transactional(rollbackFor = Exception.class)
  ProductResponse getProduct(Integer productId);
}
