package com.generation.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.ecommerce.model.Usuario;
import com.generation.ecommerce.services.UsuarioServices;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UsuarioController {
	
	@Autowired
	UsuarioServices service;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> getAll(){
		return service.encontrarTodos();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> getById(@PathVariable Long id){
		return service.encontrarPorId(id);
	}
	
	@GetMapping("/loja/{nome}")
	public ResponseEntity<List<Usuario>> getAllLojasUsuario(@PathVariable String nome){
		return service.encontrarLojasDoUsuario(nome);
		
	}
	
	@GetMapping("/n/{nome}")
	public ResponseEntity<List<Usuario>> getByNome(@PathVariable String nome){
		return service.encontrarPorNome(nome);
	}
	
	@PostMapping
	public ResponseEntity<Usuario> cadastro(@RequestBody Usuario user){
		return service.cadastroUsuario(user);
	}
	
	@PutMapping
	public ResponseEntity<Usuario> atualiza(@RequestBody Usuario user){
		return service.atualizaUsuario(user);
	}
	
	@DeleteMapping("/{id}")
	public void deletando(@PathVariable Long id) {
		service.deletandoUsuario(id);
	}
	
}
