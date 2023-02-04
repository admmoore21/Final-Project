package com.trainingfinal.dao;

import java.util.List;
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
	
	@Override
	public Optional<Client> createClient(String firstName, String lastName, Integer phone, Proficiency proficiency) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Client> fetchClients(String firstName, String lastName, Integer phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Client> updateClient(String firstName, String lastName, Integer phone, Proficiency proficiency,
			String newFirstName, String newLastName, Integer newPhone, Proficiency newProficiency) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Client> deleteClient(String firstName, String lastName, Integer phone) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
