package com.phuocvh.product.mapstruct;

import com.phuocvh.product.dtos.product.MemberPriceWrap;
import com.phuocvh.product.entities.PmsMemberPrice;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MemberPriceMapper {
  MemberPriceMapper INSTANCE = Mappers.getMapper(MemberPriceMapper.class);

  PmsMemberPrice toEntity(MemberPriceWrap memberPriceWrap);
}
