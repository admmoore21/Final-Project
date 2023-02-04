package com.trainingfinal.service;

import java.util.Optional;

import com.trainingfinal.entity.Category;

public interface CategoryService {

	Optional<Category> fetchCategory(Long categoryId);

}
