package com.generation.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	//Validando produto por nome
	public List<Produto> produtoPorNome(String nome){
		return repository.findAllByNomeProdutoContaining(nome);
	}
	
	//Validando produto por preço
	public List<Produto> produtoPorValor(float valor){
		return repository.findAllByValorContaining(valor);
	}
	
}
