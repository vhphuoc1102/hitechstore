package com.phuocvh.product.mapstruct;

import com.phuocvh.product.dtos.product.ReductionPriceWrap;
import com.phuocvh.product.entities.PmsReductionPrice;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ReductionPriceMapper {

  PmsReductionPrice toEntity(ReductionPriceWrap reductionPriceWrap);
}
