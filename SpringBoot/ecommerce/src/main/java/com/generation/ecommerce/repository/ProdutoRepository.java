package com.generation.ecommerce.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.ecommerce.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByValorLessThanEqual(float valor);
	
	public List<Produto> findAllByValorGreaterThanEqual(float valor);
	
	@Query(value = "SELECT * FROM Produto p WHERE p.nome_produto = :nome", nativeQuery = true)
	public List<Produto> findAllByNome(@Param("nome") String nome);
	
	@Query(value = "SELECT * FROM produto WHERE nome_produto = 'PlayStation'", nativeQuery = true)
	public List<Produto> findAllPlayStation();
	
	public List<Produto> findAllByNomeProdutoContainingIgnoreCase(String nomeProduto);
	
}
