package org.generation.blogPessoal.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.generation.blogPessoal.model.Postagens;
import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.model.UsuarioLogin;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.generation.blogPessoal.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;
	
	@Autowired
	private UsuarioRepository repo;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> getAll(){
		return ResponseEntity.ok(repo.findAll());
	}
	
	@PostMapping("/logar")
	public ResponseEntity<UsuarioLogin> authentication(@RequestBody Optional<UsuarioLogin> userLogin){
		return service.logar(userLogin).map(resp-> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<?> authentication(@RequestBody Usuario userNovo){
		if(service.cadastrarUsuario(userNovo).isEmpty()) {
			return ResponseEntity.status(HttpStatus.REQUEST_TIMEOUT).body("Usuário já existente!");
		} else {
			return ResponseEntity.status(HttpStatus.CREATED).body(service.cadastrarUsuario(userNovo));
		}
		
	}
	
	@PostMapping("/cadastrar/post/{id}")
	public ResponseEntity<?> criandoPost(@Valid @RequestBody Postagens novoPost, @Valid @PathVariable(value = "id") Long id ){
		if(service.criarPostagens(novoPost, id).isPresent()) {
			return ResponseEntity.status(HttpStatus.CREATED).body(service.criarPostagens(novoPost,id));
		}else {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Usuario não encontrado!");
		}
	
	}
	
}
