package com.phuocvh.product.services.Impl;

import com.phuocvh.product.entities.PmsCategory;
import com.phuocvh.product.repositories.PmsCategoryRepository;
import com.phuocvh.product.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
  private final PmsCategoryRepository pmsCategoryRepo;

  @Override
  public PmsCategory findCategoryById(Integer categoryId) {
    return pmsCategoryRepo.findById(categoryId).orElseThrow();
  }
}
