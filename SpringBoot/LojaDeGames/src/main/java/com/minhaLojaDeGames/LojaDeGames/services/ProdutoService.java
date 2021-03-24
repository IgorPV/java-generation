package com.minhaLojaDeGames.LojaDeGames.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.minhaLojaDeGames.LojaDeGames.model.Produto;
import com.minhaLojaDeGames.LojaDeGames.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	ProdutoRepository repository;
	
	public ResponseEntity<List<Produto>> findAll(){
		return ResponseEntity.status(HttpStatus.FOUND).body(repository.findAll());
	}
	
	public ResponseEntity<Produto> findAllById(Long id){
		return repository.findById(id).map(prod -> ResponseEntity.ok(prod)).orElse(ResponseEntity.notFound().build());
	}
	
	
	public ResponseEntity<List<Produto>> findByNome(String nome){
		return ResponseEntity.status(HttpStatus.FOUND).body(repository.findAllByNomeProdutoContainingIgnoreCase(nome));
	}
	
	public ResponseEntity<List<Produto>> findByPreco(Long preco){
		
		return ResponseEntity.status(HttpStatus.FOUND).body(repository.findAllByPrecoProduto(preco));
		
	}
	
	public ResponseEntity<List<Produto>> findByPlataforma(String plataforma){
		
		return ResponseEntity.status(HttpStatus.FOUND).body(repository.findAllByPlataformaContainingIgnoreCase(plataforma));
	}
	
	
	public ResponseEntity<Produto> cadastroProduto(Produto produto) {
		if(repository.findAll().contains(produto)) {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
		}else {
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
		}
	}
	
	public ResponseEntity<Produto> atualizaProduto(Produto produto) {
		if(repository.findAll().contains(produto)) {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
		}else {
			return ResponseEntity.status(HttpStatus.OK).body(repository.save(produto));
		}
	}
	
	public void deletandoProduto(Long id) {
		repository.deleteById(id);
	}

	
}
