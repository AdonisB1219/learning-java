package org.generation.ecommerce.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.generation.ecommerce.model.ChangePassword;
import org.generation.ecommerce.model.Usuario;
import org.generation.ecommerce.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping(path="/api/usuarios")
public class UsuarioController {
	
	private final UsuarioService usuarioService;
	
	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
	}
	

	@GetMapping
	public List<Usuario> getUsuarios(){
		return usuarioService.getAllUsuarios();
	}


	@GetMapping("/{id}")
	public Usuario getUsuarios(@PathVariable("id") Long id){
		return usuarioService.getUsuario(id);
		
	}
	
	@PostMapping
	public Usuario addUsuarios(@RequestBody Usuario usuario){
		return usuarioService.addUsuario(usuario);

	}
	
	@DeleteMapping("/{id}")
	public Usuario deleteUsuarios(@PathVariable("id") Long id){
		return usuarioService.deleteUsuario(id);

	}
	
	@PutMapping("/{id}")
	public Usuario updateUsuarios(@PathVariable("id") Long id, @RequestBody ChangePassword changePassword){
		return usuarioService.updateUsuario(id, changePassword);
	}
	
	
	
	
}
