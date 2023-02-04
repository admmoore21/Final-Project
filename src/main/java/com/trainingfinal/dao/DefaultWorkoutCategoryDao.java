package com.trainingfinal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.trainingfinal.entity.WorkoutCategory;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DefaultWorkoutCategoryDao implements WorkoutCategoryDao {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public List<WorkoutCategory> fetchWorkoutCategories(Long workoutId) {
		// TODO Auto-generated method stub
		return null;
	}

}
