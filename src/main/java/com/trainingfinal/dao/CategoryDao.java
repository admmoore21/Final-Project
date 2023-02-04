package com.trainingfinal.dao;

import java.util.Optional;

import com.trainingfinal.entity.Category;

public interface CategoryDao {

	Optional<Category> fetchCategory(Long categoryId);

}
