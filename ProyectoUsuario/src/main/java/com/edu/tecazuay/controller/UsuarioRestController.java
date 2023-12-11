package com.edu.tecazuay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.edu.tecazuay.model.entity.Usuario;
import com.edu.tecazuay.model.service.ServiceUsuarioIMP;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {

	@Autowired
	ServiceUsuarioIMP usuarioService;

	@GetMapping("/usuarios")
	public List<Usuario> index() {
		return usuarioService.listAllUsers();
	}

	@GetMapping("/usuario/{id}")
	public Usuario findUsuarioById(@PathVariable("id") Long id_usuario) {
		return usuarioService.findUserByID(id_usuario);
	}

	@PostMapping("/crear-usuario")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario crearUsuario(Usuario usuario) {
		return usuarioService.saveUser(usuario);
	}

	@PutMapping("/actualizar-usuario/{id}")
	public Usuario updateUsario(@RequestBody Usuario usuario, @PathVariable("id") Long id_usuario) {

		Usuario usuarioActual = usuarioService.findUserByID(id_usuario);

		usuarioActual.setNombre(usuario.getNombre());
		usuarioActual.setEmail(usuario.getEmail());
		usuarioActual.setClave(usuario.getClave());
		usuarioActual.setEstado(usuario.getEstado());

		return usuarioService.saveUser(usuarioActual);
	}

	@DeleteMapping("/borrar-usuario/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteUsuario(@PathVariable("id") Long id_usuario) {
		usuarioService.deleteUsuarioByID(id_usuario);
	}
}
