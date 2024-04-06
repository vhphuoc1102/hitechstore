package com.phuocvh.product.services;

import com.phuocvh.product.entities.PmsCategory;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {
  PmsCategory findCategoryById(Integer categoryId);
}
