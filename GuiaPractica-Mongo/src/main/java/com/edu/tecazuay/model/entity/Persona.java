package com.edu.tecazuay.model.entity;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "persons")
public class Persona {

	@Id
	private String _id;
	private String name;
	private String lastName;
	private String address;
	private Contactos contacts;
	private List<Telefonia> telephonyList;
	
}
