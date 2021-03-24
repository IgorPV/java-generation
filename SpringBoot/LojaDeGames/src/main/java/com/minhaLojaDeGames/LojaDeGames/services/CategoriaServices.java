package com.minhaLojaDeGames.LojaDeGames.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.minhaLojaDeGames.LojaDeGames.model.Categoria;
import com.minhaLojaDeGames.LojaDeGames.repository.CategoriaRepository;

@Service
public class CategoriaServices {

	@Autowired
	CategoriaRepository repository;
	
	public ResponseEntity<List<Categoria>> findAll(){
		return ResponseEntity.status(HttpStatus.FOUND).body(repository.findAll());
	}
	
	public ResponseEntity<Categoria> findAllById(Long id){
		return repository.findById(id)
				.map(cat -> ResponseEntity.ok(cat))
				.orElse(ResponseEntity.notFound().build());
	}
	
	
	/*
	 * Encontra as categorias pelo tipo de jogo
	 * 
	 * 
	 */
	public ResponseEntity<List<Categoria>> findByTipo(String tipo){
		
		return ResponseEntity.status(HttpStatus.FOUND).body(repository.findAllByTipoDeJogoContainingIgnoreCase(tipo));
		
	}
	
	
	/*
	 * Cadastrar cateogria
	 */
	
	public ResponseEntity<Categoria> novaCategoria(Categoria categoria) {
		if(repository.findAll().contains(categoria)) {
			return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
		}else {
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
		}
	}
	
	//deletar categoria
	
	public void deletandoCategoria(Long id) {
		repository.deleteById(id);
	}

}

