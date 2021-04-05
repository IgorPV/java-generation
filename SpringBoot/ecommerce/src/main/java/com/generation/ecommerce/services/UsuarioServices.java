package com.generation.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.generation.ecommerce.model.Usuario;
import com.generation.ecommerce.repository.UsuarioRepository;

@Service
public class UsuarioServices {
	
	@Autowired
	UsuarioRepository repository;
	
	//cadastrando usuário
	public ResponseEntity<Usuario> cadastroUsuario(Usuario novoUsuario) {
		
		if(repository.existsByNomeContainingIgnoreCase(novoUsuario.getNome())){
			return ResponseEntity.status(HttpStatus.ALREADY_REPORTED).build();
		}else {
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(novoUsuario));
		}
		
	}
	
	//atualizando cadastro
	public ResponseEntity<Usuario> atualizaUsuario(Usuario novoUsuario) {
		
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(novoUsuario));
		
	}
	
	//encontrando todos users
	public ResponseEntity<List<Usuario>> encontrarTodos(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	//validando user pelo nome
	
	public ResponseEntity<List<Usuario>> encontrarPorNome(String nome){
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	//validando user pelo id
	public ResponseEntity<Usuario> encontrarPorId(Long id){
		return repository.findById(id).map(user -> ResponseEntity.ok(user)).orElse(ResponseEntity.notFound().build());
	}
	
	//encontrando usuarios e lojas criadas
	public ResponseEntity<List<Usuario>> encontrarLojasDoUsuario(String usuario){
		return ResponseEntity.ok(repository.findAllByUsuarioLojaContainingIgnoreCase(usuario));
	}
	 
	//deletando usuario
	public void deletandoUsuario(Long id) {
		repository.deleteById(id);
	}
}
