package com.minhaLojaDeGames.LojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minhaLojaDeGames.LojaDeGames.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByNomeProdutoContainingIgnoreCase(String nomeProduto);
	
	public List<Produto> findAllByPrecoProduto(Long precoProduto);
	
	public List<Produto> findAllByPlataformaContainingIgnoreCase(String plataforma);
	
	public List<Produto> findAllByCategoriaProdutosContaining(String categoriaProdutos);
	
	
}
