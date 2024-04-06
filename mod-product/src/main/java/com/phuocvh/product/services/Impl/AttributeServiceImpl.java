package com.phuocvh.product.services.Impl;

import com.phuocvh.product.entities.PmsProdAttrGroup;
import com.phuocvh.product.services.AttributeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class AttributeServiceImpl implements AttributeService {
  @Override
  public PmsProdAttrGroup findAttrGroupByKey(Integer prodAttrGroupId) {
    return null;
  }
}
