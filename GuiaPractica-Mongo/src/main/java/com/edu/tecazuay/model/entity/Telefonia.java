package com.edu.tecazuay.model.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "telefonias")
public class Telefonia {

	private String telephonyType;
	private String telephone;
	
}
