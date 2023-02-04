package com.trainingfinal.dao;

import java.util.List;
import java.util.Optional;

import com.trainingfinal.entity.Client;
import com.trainingfinal.entity.Proficiency;

public interface ClientDao {

	Optional<Client> createClient(String firstName, String lastName, Integer phone, Proficiency proficiency);

	List<Client> fetchClients(String firstName, String lastName, Integer phone);

	Optional<Client> updateClient(String firstName, String lastName, Integer phone, Proficiency proficiency,
			String newFirstName, String newLastName, Integer newPhone, Proficiency newProficiency);

	Optional<Client> deleteClient(String firstName, String lastName, Integer phone);

}
