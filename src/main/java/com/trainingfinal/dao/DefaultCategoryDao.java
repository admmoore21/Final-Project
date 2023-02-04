package com.trainingfinal.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.trainingfinal.entity.Category;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DefaultCategoryDao implements CategoryDao {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public Optional<Category> fetchCategory(Long categoryId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
