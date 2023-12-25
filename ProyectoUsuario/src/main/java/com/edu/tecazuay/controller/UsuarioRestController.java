package com.edu.tecazuay.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.edu.tecazuay.model.entity.Usuario;
import com.edu.tecazuay.model.service.IUsuarioService;
import com.edu.tecazuay.model.service.s3.S3Service;

@RestController
@RequestMapping("/api")
public class UsuarioRestController {

	@Autowired
	private IUsuarioService userService;

	@Autowired
	private S3Service s3Service;

	@GetMapping("/usuarios")
	public List<Usuario> listarUsuarios() {
	    return userService.listAllUsers()
	            .stream()
	            .peek(usuario -> {
	                usuario.setFotoUrl(s3Service.getObjectURL(usuario.getFotoUrl()));
	                usuario.setCedulaUrl(s3Service.getObjectURL(usuario.getCedulaUrl()));
	            })
	            .collect(Collectors.toList());
	}

	@GetMapping("/usuario/{id}")
	public Usuario findUsuarioById(@PathVariable("id") Long id_usuario) {
		return userService.findUserByID(id_usuario);
	}

	@PostMapping("/crear-usuario")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario saveUsuario(@RequestBody Usuario usuario) {
		userService.saveUser(usuario);
		usuario.setFotoUrl(s3Service.getObjectURL(usuario.getFotoUrl()));
		usuario.setCedulaUrl(s3Service.getObjectURL(usuario.getCedulaUrl()));
		return usuario;
	}


	@PutMapping("/actualizar-usuario/{id}")
	public Usuario updateUsario(@RequestBody Usuario usuario, @PathVariable("id") Long id_usuario) {

		Usuario usuarioActual = userService.findUserByID(id_usuario);

		usuarioActual.setNombre(usuario.getNombre());
		usuarioActual.setEmail(usuario.getEmail());
		usuarioActual.setClave(usuario.getClave());
		usuarioActual.setEstado(usuario.getEstado());

		
		return userService.saveUser(usuarioActual);
	}

	@DeleteMapping("/borrar-usuario/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteUsuario(@PathVariable("id") Long id_usuario) {
		userService.deleteUsuarioByID(id_usuario);
	}
}
