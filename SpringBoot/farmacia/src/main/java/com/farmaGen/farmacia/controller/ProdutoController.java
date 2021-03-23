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

import com.farmaGen.farmacia.model.Produto;
import com.farmaGen.farmacia.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class ProdutoController {
	
	@Autowired
	ProdutoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Produto>> getAll(){
		return ResponseEntity.ok(repository.findAll());
		
	}
	
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Produto>> getNome(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByNomeProdutoContainingIgnoreCase(nome));
		
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> getById(@PathVariable Long id){
		
		return repository.findById(id).map(prod -> ResponseEntity.ok(prod)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/categoria/{categoria}")
	public ResponseEntity<List<Produto>> getCategoria(@PathVariable String categoria){
		return ResponseEntity.ok(repository.findAllByCategoriaProdutosContaining(categoria));
		
	}
	
	@PostMapping
	public ResponseEntity<Produto> criandoProduto(@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
	}
	
	@PutMapping
	public ResponseEntity<Produto> atualizandoProduto(@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(produto));
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	
}
