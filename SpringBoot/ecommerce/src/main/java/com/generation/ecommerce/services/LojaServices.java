package com.generation.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.ecommerce.model.Loja;
import com.generation.ecommerce.model.Produto;
import com.generation.ecommerce.repository.LojaRepository;

@Service
public class LojaServices {
	
	@Autowired
	LojaRepository repository;
	
	//NOVA LOJA
	
	public Loja cadastroLoja(Loja novaLoja) {
		
		return repository.save(novaLoja);
		
	}
	
	//Lista de lojas por nome
	
	public List<Loja> lojasPorNome(String nome){
		return repository.findAllByNomeLojaContainingIgnoreCase(nome);
	}
	
	//Procurando lojas por descrição
	
	public List<Loja> lojasPorDescricao(String desc){
		return repository.findAllByDescricaoContainingIgnoreCase(desc);
	}
	
}
