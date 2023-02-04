package com.trainingfinal.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.trainingfinal.entity.Workout;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DefaultWorkoutDao implements WorkoutDao {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public Optional<Workout> createWorkout(String workoutName, Long clientId, Double estimatedHrs, BigDecimal price) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Workout> fetchWorkouts(Long clientId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Workout> updateWorkout(String workoutName, Long clientId, Double estimatedHrs, BigDecimal price,
			String newWorkoutName, Long newClientId, Double newEstimatedHrs, BigDecimal newPrice) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}


	/*	public List<Exercise> fetchExercises(List<String> exerciseIds) {
		if(exerciseIds.isEmpty()) {
			return new LinkedList<>();
		}
		
		Map<String, Object> params = new HashMap<>();
		
		// @formatter:off
	    String sql = ""
	        + "SELECT * "
	        + "FROM exercises "
	        + "WHERE exercise_id IN(";
	    // @formatter:on
		
	    for (int index = 0; index < exerciseIds.size(); index++) {
			String key = "exercise_" + index;
			sql += ":" + key + ", ";
			params.put(key, exerciseIds.get(index));
		}

		sql = sql.substring(0, sql.length() - 2);
		sql += ")";
	    
		return jdbcTemplate.query(sql, params, new RowMapper<Exercise>() {
			@Override
			public Exercise mapRow(ResultSet rs, int rowNum) throws SQLException {
			// @formatter:off
	        return Exercise.builder()
	            .exerciseId(rs.getLong("exercise_id"))
	            .workoutId(rs.getLong("workout_id"))
	            .exerciseName(rs.getString("exercise_name"))
	            .numReps(rs.getInt("num_reps"))
	            .numSets(rs.getInt("num_sets"))
	            .weightLbs(rs.getDouble("weight_lbs"))
	            .ratedPercievedExertion(Rpe.valueOf(rs.getString("RPE")))
	            .build();
	        // @formatter:on
			}
		});
	}
*/
}
