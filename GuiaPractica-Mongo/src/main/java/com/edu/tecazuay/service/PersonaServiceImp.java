package com.edu.tecazuay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.edu.tecazuay.model.entity.Persona;
import com.edu.tecazuay.repository.PersonaRepository;

@Service
public class PersonaServiceImp extends GenericServiceImp<Persona, String> implements PersonaService {

	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public CrudRepository<Persona, String> getDao() {
		return personaRepository;
	}

}
