package com.generation.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.generation.ecommerce.model.Produto;
import com.generation.ecommerce.repository.ProdutoRepository;

@Service
public class ProdutoServices {
	
	@Autowired
	ProdutoRepository repository;
	
	//Novo produto
	public Produto cadastroProduto(Produto novo) {
		return repository.save(novo);
	}
	
	//atualizando produto
	public Produto atualizandoProduto(Produto atualizado) {
		return repository.save(atualizado);
	}
	
	//Validando produto por nome contendo e ignorando upper case
	public List<Produto> produtoPorNome(String nome){
		return repository.findAllByNomeProdutoContainingIgnoreCase(nome);
	}
	
	//Validando produto por preço menor ou igual 
	public List<Produto> produtoPorValorMenorIgual(float valor){
		return repository.findAllByValorLessThanEqual(valor);
	}
	
	//Validando produto por preço maior ou igual
	public List<Produto> produtoPorValorMaiorIgual(float valor){
		return repository.findAllByValorGreaterThanEqual(valor);
	}
	
	//validando produto por nome usando query
	public List<Produto> produtoPorNomeQuery(String nome){
		return repository.findAllByNome(nome);
	}
	
	
	//encontrando playstation
	public List<Produto> playStation(){
		return repository.findAllPlayStation();
	}
	
	//DELETANDO
	public void deleteProduto(Long id) {
		repository.deleteById(id);
	}
	
}
