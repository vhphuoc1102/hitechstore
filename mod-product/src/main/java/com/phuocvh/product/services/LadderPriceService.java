package com.phuocvh.product.services;

import com.phuocvh.product.entities.PmsProduct;

import java.util.List;

public interface LadderPriceService {
  List<Integer> findIdList(PmsProduct product);
}
