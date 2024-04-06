package com.phuocvh.product.repositories;

import com.phuocvh.product.entities.PmsLadderPrice;
import com.phuocvh.product.entities.PmsProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PmsLadderPriceRepository extends JpaRepository<PmsLadderPrice, Integer> {
  public List<PmsLadderPrice> findByProductId(PmsProduct product);
}
