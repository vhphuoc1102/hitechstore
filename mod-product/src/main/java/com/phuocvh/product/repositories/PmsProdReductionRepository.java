package com.phuocvh.product.repositories;

import com.phuocvh.product.entities.PmsReductionPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PmsProdReductionRepository extends JpaRepository<PmsReductionPrice, Integer> {}
