package com.phuocvh.product.services;

import com.phuocvh.product.entities.PmsProdAttrGroup;

public interface AttributeService {
  PmsProdAttrGroup findAttrGroupByKey(Integer prodAttrGroupId);
}
