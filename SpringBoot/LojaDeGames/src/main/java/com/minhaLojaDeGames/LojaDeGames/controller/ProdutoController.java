package com.minhaLojaDeGames.LojaDeGames.controller;

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


import com.minhaLojaDeGames.LojaDeGames.model.Produto;
import com.minhaLojaDeGames.LojaDeGames.services.ProdutoService;

@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class ProdutoController {

	@Autowired
	ProdutoService services;
	
	@GetMapping
	public ResponseEntity<List<Produto>> getAll(){
		return services.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> getById(@PathVariable Long id){
		return services.findAllById(id);
	}
	
	@GetMapping("/prod/n/{nome}")
	public ResponseEntity<List<Produto>> getByNome(@PathVariable String nome){
		return services.findByNome(nome);
	}
	
	@GetMapping("/prod/p/{preco}")
	public ResponseEntity<List<Produto>> getByPreco(@PathVariable Long preco){
		return services.findByPreco(preco);
	}
	
	@GetMapping("/prod/pl/{plataforma}")
	public ResponseEntity<List<Produto>> getByPlataforma(@PathVariable String plataforma){
		return services.findByPlataforma(plataforma);
	}
	
	
	@PostMapping
	public ResponseEntity<Produto> cadastro(@RequestBody Produto produto){
		return services.cadastroProduto(produto);
	}
	
	@PutMapping
	public ResponseEntity<Produto> atualizacao(@RequestBody Produto produto){
		return services.atualizaProduto(produto);
	}
	
	@DeleteMapping("/{id}")
	public void deletando(@PathVariable Long id) {
		services.deletandoProduto(id);
	}
}
