package com.edu.tecazuay.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.edu.tecazuay.model.entity.Persona;

public interface PersonaRepository extends MongoRepository<Persona, String> {

}
