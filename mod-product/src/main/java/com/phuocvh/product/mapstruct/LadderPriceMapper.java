package com.phuocvh.product.mapstruct;

import com.phuocvh.product.dtos.LadderPriceWrap;
import com.phuocvh.product.entities.PmsLadderPrice;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface LadderPriceMapper {
  LadderPriceMapper INSTANCE = Mappers.getMapper(LadderPriceMapper.class);

  PmsLadderPrice toEntity(LadderPriceWrap ladderPriceWrap);
}
