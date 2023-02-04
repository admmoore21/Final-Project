package com.trainingfinal.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Exercise {
	private Long exerciseId;
	private Long workoutId;
	private String exerciseName;
	private int numReps;
	private int numSets;
	private Double weightLbs;
	private Rpe	ratedPercievedExertion;
	
}
