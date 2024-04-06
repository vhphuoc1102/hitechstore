package com.phuocvh.product.services.Impl;

import com.phuocvh.product.entities.PmsProdAttrGroup;
import com.phuocvh.product.services.AttributeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AttributeServiceImpl implements AttributeService {
  @Override
  public PmsProdAttrGroup findAttrGroupByKey(Integer prodAttrGroupId) {
    return null;
  }
}
