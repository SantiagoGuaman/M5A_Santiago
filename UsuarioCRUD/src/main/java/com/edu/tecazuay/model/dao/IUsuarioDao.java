package com.edu.tecazuay.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.edu.tecazuay.model.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

}
