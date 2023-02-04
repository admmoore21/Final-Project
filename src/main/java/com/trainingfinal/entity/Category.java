package com.trainingfinal.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Category {
	private Long categoryId;
	private CategoryType category;
}
