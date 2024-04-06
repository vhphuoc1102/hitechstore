package com.phuocvh.product.mapstruct;

import com.phuocvh.product.dtos.ProdAttrValueWrap;
import com.phuocvh.product.entities.PmsProdAttrValue;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ProdAttrValueMapper {
  ProdAttrValueMapper INSTANCE = Mappers.getMapper(ProdAttrValueMapper.class);

  PmsProdAttrValue toEntity(ProdAttrValueWrap prodAttrValueWrap);
}
