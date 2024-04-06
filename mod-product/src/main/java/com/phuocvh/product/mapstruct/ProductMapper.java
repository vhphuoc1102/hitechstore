package com.phuocvh.product.mapstruct;

import com.phuocvh.product.entities.PmsProduct;
import com.phuocvh.product.payloads.requests.product.ProductRequest;
import com.phuocvh.product.payloads.responses.product.ProductResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ProductMapper {
  PmsProduct toEntity(ProductRequest request);

  ProductResponse toResponse(PmsProduct product);
}
