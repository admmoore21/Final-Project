package com.trainingfinal.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.trainingfinal.entity.Client;
import com.trainingfinal.entity.Proficiency;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DefaultClientDao implements ClientDao {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	// Post/Create method to create clients within clients table
	@Override
	public Optional<Client> createClient(String firstName, String lastName, String phone, Proficiency proficiency) {
		log.info("DAO: firstName={}, lastName={}, phone={}, proficiency={}", 
				firstName, lastName, phone, proficiency);
		
		//@formatter: off
		String sql = ""
				+ "INSERT INTO clients (first_name, last_name, phone, proficiency"
				+ ") VALUES ("
				+ ":first_name, :last_name, :phone, :proficiency)";
		//@formatter: on
		
		Map<String, Object> params = new HashMap<>();
		params.put("first_name", firstName);
		params.put("last_name", lastName);
		params.put("phone", phone);
		params.put("proficiency", proficiency.toString());
		
		jdbcTemplate.update(sql, params);
		return Optional.ofNullable(Client.builder().firstName(firstName).lastName(lastName).phone(phone).proficiency(proficiency).build());
	}

	// Get/Read method to fetch clients within clients table
	@Override
	public List<Client> fetchClients(String firstName, String lastName, String phone) {
		// TODO Auto-generated method stub
		return null;
	}

	// Put/Update method to create clients within clients table
	@Override
	public Optional<Client> updateClient(String firstName, String lastName, String phone, Proficiency proficiency,
			String newFirstName, String newLastName, String newPhone, Proficiency newProficiency) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	// Delete method to delete clients within clients table
	@Override
	public Optional<Client> deleteClient(String firstName, String lastName, String phone) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
