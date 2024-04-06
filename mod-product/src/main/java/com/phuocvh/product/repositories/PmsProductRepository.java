package com.phuocvh.product.repositories;

import com.phuocvh.product.entities.PmsProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PmsProductRepository extends JpaRepository<PmsProduct, Integer> {}
