package com.phuocvh.product.mapstruct;

import com.phuocvh.product.dtos.SkuWrap;
import com.phuocvh.product.entities.PmsSku;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface SkuMapper {
  PmsSku toEntity(SkuWrap skuWrap);
}
