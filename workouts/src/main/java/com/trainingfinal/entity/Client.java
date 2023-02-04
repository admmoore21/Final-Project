package com.trainingfinal.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Client {
	private Long clientId;
	private String firstName;
	private String lastName;
	private String phone;
	private Proficiency proficiency;

}
