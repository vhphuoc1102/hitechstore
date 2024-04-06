package com.phuocvh.product.services.Impl;

import com.phuocvh.product.entities.PmsCategory;
import com.phuocvh.product.repositories.PmsCategoryRepository;
import com.phuocvh.product.services.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class CategoryServiceImpl implements CategoryService {
  private final PmsCategoryRepository pmsCategoryRepo;

  @Override
  public PmsCategory findCategoryById(Integer categoryId) {
    return pmsCategoryRepo.findById(categoryId).orElseThrow();
  }
}
