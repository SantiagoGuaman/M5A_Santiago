package com.edu.tecazuay.model.service;

import java.util.List;

import com.edu.tecazuay.model.entity.Usuario;

public interface IUsuarioService {

	public List<Usuario> listAllUsers();

	public Usuario saveUser(Usuario usuario);

	public Usuario findUserByID(Long id_usuario);

	public void deleteUsuarioByID(Long id_usuario);

}
