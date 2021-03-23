package com.farmaGen.farmacia.controller;

import java.util.List;

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

import com.farmaGen.farmacia.model.Categoria;

import com.farmaGen.farmacia.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController {
	
	@Autowired
	CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> getAll(){
		return ResponseEntity.ok(repository.findAll());
		
	}
	
	
	@GetMapping("/categoria/{nome}")
	public ResponseEntity<List<Categoria>> getNome(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByNomeCategoriaContaining(nome));
		
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> getById(@PathVariable Long id){
		
		return repository.findById(id).map(prod -> ResponseEntity.ok(prod)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/categoria/{produtos}")
	public ResponseEntity<List<Categoria>> getCategoria(@PathVariable String produtos){
		return ResponseEntity.ok(repository.findAllByProdutosCategorizadosContainingIgnoreCase(produtos));
		
	}
	
	@PostMapping
	public ResponseEntity<Categoria> criandoProduto(@RequestBody Categoria categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}
	
	@PutMapping
	public ResponseEntity<Categoria> atualizandoProduto(@RequestBody Categoria categoria){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria));
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	
}
