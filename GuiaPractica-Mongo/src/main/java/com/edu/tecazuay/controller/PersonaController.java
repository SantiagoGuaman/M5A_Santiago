package com.edu.tecazuay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.edu.tecazuay.model.entity.Persona;
import com.edu.tecazuay.service.PersonaService;

@RestController
@CrossOrigin
@RequestMapping("/api/persona")
public class PersonaController {

	@Autowired
	private PersonaService personaService;

	@GetMapping("/listar")
	public ResponseEntity<List<Persona>> personList() {
		return new ResponseEntity<>(personaService.findAll(), HttpStatus.OK);
	}

	@PostMapping("/crear")
	public ResponseEntity<Persona> createPerson(@RequestBody Persona persona) {
		System.out.println(persona);
		return new ResponseEntity<>(personaService.save(persona), HttpStatus.CREATED);
	}

	@PutMapping("/actualizar/{id}")
	public ResponseEntity<Persona> updatePerson(@PathVariable("id") String id, @RequestBody Persona persona) {

		Persona currentPerson = personaService.findById(id);

		if (currentPerson == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		try {
			currentPerson.setName(persona.getName());
			currentPerson.setLastName(persona.getLastName());
			currentPerson.setAddress(persona.getAddress());
			return new ResponseEntity<>(personaService.save(currentPerson), HttpStatus.OK);

		} catch (DataAccessException e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Persona> deletePerson(@PathVariable String id) {
		personaService.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
