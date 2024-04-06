package com.phuocvh.product.controllers;

import com.phuocvh.product.payloads.requests.product.ProductRequest;
import com.phuocvh.product.payloads.responses.product.ProductResponse;
import com.phuocvh.product.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product")
@RequiredArgsConstructor
public class PmsProductController {
  private final ProductService productService;

  @PostMapping
  public void createProduct(@Validated @RequestBody ProductRequest request) {
    productService.saveProduct(request);
  }

  @PutMapping
  public void updateProduct(@Validated @RequestBody ProductRequest request){
    productService.saveProduct(request);
  }

  @GetMapping("{productId}")
  public ResponseEntity<ProductResponse> getProduct(@PathVariable("productId") Integer productId){
    return ResponseEntity.ok(productService.getProduct(productId));
  }
}
