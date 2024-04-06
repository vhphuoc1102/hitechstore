package com.phuocvh.product.services.Impl;

import com.phuocvh.product.entities.PmsLadderPrice;
import com.phuocvh.product.entities.PmsProduct;
import com.phuocvh.product.repositories.PmsLadderPriceRepository;
import com.phuocvh.product.services.LadderPriceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
public class LadderPriceServiceImpl implements LadderPriceService {
  private final PmsLadderPriceRepository pmsLadderPriceRepo;

  @Override
  public List<Integer> findIdList(PmsProduct product){
    return pmsLadderPriceRepo.findByProductId(product).stream()
        .map(PmsLadderPrice::getId).toList();
  }
}

