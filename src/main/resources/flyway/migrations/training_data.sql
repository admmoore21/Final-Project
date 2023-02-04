-- clients
insert into clients (first_name, last_name, phone, proficiency) values('John', 'Sands', '1234567890', 'intermediate');
insert into clients (first_name, last_name, phone, proficiency) values('Kevin', 'Terris', '0987654321', 'intermediate');

-- workouts
insert into workouts (workout_name, client_id, estimated_hrs, price) values('MONDAY_LEG_PUSH', 1, 1.5, 15.0);
insert into workouts (workout_name, client_id, estimated_hrs, price) values('TUESDAY_ARMS_PUSH', 1, 1.5, 15.0);
insert into workouts (workout_name, client_id, estimated_hrs, price) values('MONDAY_LEG_PUSH', 2, 1.5, 15.0);
insert into workouts (workout_name, client_id, estimated_hrs, price) values('TUESDAY_ARMS_PUSH', 2, 1.5, 15.0);

-- exercises
insert into exercises (workout_id, exercise_name, num_reps, num_sets, weight_lbs, RPE) values(1, 'Squat', 8, 3, 135, 'four');
insert into exercises (workout_id, exercise_name, num_reps, num_sets, weight_lbs, RPE) values(1, 'Leg_Extension', 8, 3, 25, 'five');
insert into exercises (workout_id, exercise_name, num_reps, num_sets, weight_lbs, RPE) values(2, 'Tricep_Extension', 8, 3, 35, 'five');
insert into exercises (workout_id, exercise_name, num_reps, num_sets, weight_lbs, RPE) values(2, 'Bench_Press', 8, 3, 135, 'three');
insert into exercises (workout_id, exercise_name, num_reps, num_sets, weight_lbs, RPE) values(3, 'Squat', 8, 3, 145, 'three');
insert into exercises (workout_id, exercise_name, num_reps, num_sets, weight_lbs, RPE) values(3, 'Leg_Extension', 8, 3, 40, 'three');
insert into exercises (workout_id, exercise_name, num_reps, num_sets, weight_lbs, RPE) values(4, 'Tricep_Extension', 8, 3, 35, 'four');
insert into exercises (workout_id, exercise_name, num_reps, num_sets, weight_lbs, RPE) values(4, 'Bench_Press', 8, 3, 135, 'four');

-- categories
insert into categories(category_id, category_name) values(1, 'GENERAL');
insert into categories(category_id, category_name) values(2, 'HYPERTROPHY');
insert into categories(category_id, category_name) values(3, 'STRENGTH');
insert into categories(category_id, category_name) values(4, 'LEGS');
insert into categories(category_id, category_name) values(5, 'ARMS');

-- workout categories
insert into workout_category(workout_id, category_id) values(1, 4);
insert into workout_category(workout_id, category_id) values(1, 2);
insert into workout_category(workout_id, category_id) values(2, 5);
insert into workout_category(workout_id, category_id) values(2, 3);
insert into workout_category(workout_id, category_id) values(3, 4);
insert into workout_category(workout_id, category_id) values(3, 2);
insert into workout_category(workout_id, category_id) values(4, 5);
insert into workout_category(workout_id, category_id) values(4, 3);