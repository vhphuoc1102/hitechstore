package com.phuocvh.product.mapstruct;

import com.phuocvh.product.dtos.product.SkuWrap;
import com.phuocvh.product.entities.PmsSku;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SkuMapper {
  PmsSku toEntity(SkuWrap skuWrap);
}
