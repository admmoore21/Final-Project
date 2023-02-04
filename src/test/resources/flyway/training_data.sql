-- clients
insert into clients (first_name, last_name, phone, proficiency) values('John', 'Sands', 1234567890, 'intermediate');
insert into clients (first_name, last_name, phone, proficiency) values('Kevin', 'Terris', 0987654321, 'intermediate');

-- workouts
insert into workouts (workout_name, client_id, estimated_hrs, RPE, price) values('MONDAY_LEG_PUSH', 1, 1.5, 3, 15.0);
insert into workouts (workout_name, client_id, estimated_hrs, RPE, price) values('TUESDAY_ARMS_PUSH', 1, 1.5, 3, 15.0);
insert into workouts (workout_name, client_id, estimated_hrs, RPE, price) values('MONDAY_LEG_PUSH', 2, 1.5, 3, 15.0);
insert into workouts (workout_name, client_id, estimated_hrs, RPE, price) values('TUESDAY_ARMS_PUSH', 2, 1.5, 3, 15.0);

-- exercises
insert into exercises (workout_id, exercise_name, num_reps, num_sets, weight_lbs) values (1, 'Squat', 8, 3, 135);
insert into exercises (workout_id, exercise_name, num_reps, num_sets, weight_lbs) values (1, 'Leg_Extension', 8, 3, 25);
insert into exercises (workout_id, exercise_name, num_reps, num_sets, weight_lbs) values (2, 'Tricep_Extension', 8, 3, 35);
insert into exercises (workout_id, exercise_name, num_reps, num_sets, weight_lbs) values (2, 'Bench_Press', 8, 3, 135);
insert into exercises (workout_id, exercise_name, num_reps, num_sets, weight_lbs) values (3, 'Squat', 8, 3, 145);
insert into exercises (workout_id, exercise_name, num_reps, num_sets, weight_lbs) values (3, 'Leg_Extension', 8, 3, 40);
insert into exercises (workout_id, exercise_name, num_reps, num_sets, weight_lbs) values (4, 'Tricep_Extension', 8, 3, 35);
insert into exercises (workout_id, exercise_name, num_reps, num_sets, weight_lbs) values (4, 'Bench_Press', 8, 3, 135);

