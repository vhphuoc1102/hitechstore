package com.phuocvh.product.controllers;

import com.phuocvh.product.payloads.requests.product.CreateProductRequest;
import com.phuocvh.product.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product")
@RequiredArgsConstructor
public class PmsProductController {
  private final ProductService productService;

  @PostMapping
  public void createProduct(@Validated @RequestBody CreateProductRequest request) {
    productService.createProduct(request);
  }
}
