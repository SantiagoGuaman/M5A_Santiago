package com.edu.tecazuay.model.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class Usuario implements Serializable {

	/**
	 * UID Serial
	 */
	private static final long serialVersionUID = 6873341125514752550L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_usuario;
	private String nombre;
	private char[] clave;

	@Column(unique = true)
	private String email;
	private Boolean estado;

	@Transient
	private String fotoUrl;

	@Transient
	private String cedulaUrl;

}
