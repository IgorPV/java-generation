package org.generation.blogPessoal.controller;

import java.util.Optional;

import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.model.UsuarioLogin;
import org.generation.blogPessoal.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	
	
}
