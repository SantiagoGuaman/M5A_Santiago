package com.edu.tecazuay.model.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "contacts")
public class Contactos {

	private String name;
	private String phone;
	
}
