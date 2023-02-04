package com.trainingfinal.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trainingfinal.dao.CategoryDao;
import com.trainingfinal.entity.Category;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultCategoryService implements CategoryService {

	@Autowired
	private CategoryDao categoryDao;
	@Override
	public Optional<Category> fetchCategory(Long categoryId) {
		log.info("categoryId={}", categoryId);
		return categoryDao.fetchCategory(categoryId);
	}
}
