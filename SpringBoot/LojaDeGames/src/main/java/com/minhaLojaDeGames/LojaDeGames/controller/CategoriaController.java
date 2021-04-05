package com.minhaLojaDeGames.LojaDeGames.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minhaLojaDeGames.LojaDeGames.model.Categoria;
import com.minhaLojaDeGames.LojaDeGames.services.CategoriaServices;

@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController {
	
	
	@Autowired
	CategoriaServices services;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> getAll(){
		return services.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> getById(@PathVariable Long id){
		return services.findAllById(id);
	}
	
	@GetMapping("/cat/{categoria}")
	public ResponseEntity<List<Categoria>> findByCategoria(@PathVariable String categoria){
		return services.findByTipo(categoria);
	}
	
	@PostMapping
	public ResponseEntity<Categoria> cadastro(@RequestBody Categoria categoria){
		return services.novaCategoria(categoria);
	}
	
	@DeleteMapping("/{id}")
	public void deletando(@PathVariable Long id) {
		services.deletandoCategoria(id);
	}
	
}
