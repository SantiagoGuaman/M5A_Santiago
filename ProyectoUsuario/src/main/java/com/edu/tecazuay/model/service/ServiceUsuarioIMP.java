package com.edu.tecazuay.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.tecazuay.model.dao.IUsuarioDao;
import com.edu.tecazuay.model.entity.Usuario;

@Service
public class ServiceUsuarioIMP implements IUsuarioService {

	@Autowired
	IUsuarioDao usuarioDAO;

	@Override
	@Transactional (readOnly = true)
	public List<Usuario> listAllUsers() {
		return (List<Usuario>) usuarioDAO.findAll();
	}

	@Override
	@Transactional
	public Usuario saveUser(Usuario usuario) {
		return usuarioDAO.save(usuario);
	}

	@Override
	@Transactional (readOnly = true)
	public Usuario findUserByID(Long id_usuario) {
		return usuarioDAO.findById(id_usuario).orElse(null);
	}

	@Override
	@Transactional
	public void deleteUsuarioByID(Long id_usuario) {
		usuarioDAO.deleteById(id_usuario);
	}

}
