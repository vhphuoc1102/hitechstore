package com.phuocvh.product.mapstruct;

import com.phuocvh.product.entities.PmsProduct;
import com.phuocvh.product.payloads.requests.product.CreateProductRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {
  PmsProduct toEntity(CreateProductRequest request);
}
