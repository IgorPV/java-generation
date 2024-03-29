package org.generation.blogPessoal.controller;

import java.util.List;
import org.generation.blogPessoal.model.Postagens;
import org.generation.blogPessoal.repository.PostagensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")

public class PostagensController {

	@Autowired
	private PostagensRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Postagens>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Postagens> GetById(@PathVariable Long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/ttl/{titulo}")
	public ResponseEntity<List<Postagens>> GetByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	@GetMapping("/txt/{texto}")
	public ResponseEntity<List<Postagens>> GetByTexto(@PathVariable String texto){
		return ResponseEntity.ok(repository.findAllByTextoContainingIgnoreCase(texto));
	}
	
	@PostMapping
	public ResponseEntity<Postagens> postagem(@RequestBody Postagens post){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(post));
	}
	
	@PutMapping
	public ResponseEntity<Postagens> put(@RequestBody Postagens post){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(post));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		
		repository.deleteById(id);
			
	}
	
}
