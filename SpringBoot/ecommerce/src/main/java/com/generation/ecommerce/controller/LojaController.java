package com.generation.ecommerce.controller;

import java.util.List;
import java.util.Optional;

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

import com.generation.ecommerce.model.Loja;
import com.generation.ecommerce.services.LojaServices;

@RestController
@RequestMapping("/loja")
@CrossOrigin("*")
public class LojaController {

	@Autowired
	LojaServices service;
	
	@GetMapping
	public ResponseEntity<List<Loja>> getAll(){
		return ResponseEntity.ok(service.lojas());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Loja>> getById(@PathVariable Long id){
		if(service.lojasPorId(id).isPresent()) {
			return ResponseEntity.ok(service.lojasPorId(id));
		}else {
			return ResponseEntity.notFound().build();
		}
				
		//return ResponseEntity.ok(service.lojasPorId(id));
	}
	
	@GetMapping("/n/{nome}")
	public ResponseEntity<List<Loja>> getByNome(@PathVariable String nome){
		return ResponseEntity.ok(service.lojasPorNome(nome));
	}
	
	@GetMapping("/d/{desc}")
	public ResponseEntity<List<Loja>> getByDescricao(@PathVariable String desc){
		return ResponseEntity.ok(service.lojasPorDescricao(desc));
	}
	
	@PostMapping
	public ResponseEntity<Loja> criando(@RequestBody Loja novaLoja){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.cadastroLoja(novaLoja));
	}
	
	@PutMapping
	public ResponseEntity<Loja> atualizando(@RequestBody Loja novaLoja){
		return ResponseEntity.status(HttpStatus.OK).body(service.cadastroLoja(novaLoja));
	}
	
	
	@DeleteMapping("/{id}")
	public void fechando(@PathVariable Long id) {
		service.fechandoLoja(id);
	}

}
