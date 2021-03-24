package com.minhaLojaDeGames.LojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minhaLojaDeGames.LojaDeGames.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	public List<Categoria> findAllByTipoDeJogoContainingIgnoreCase(String tipoDeJogo);
	
	public List<Categoria> findAllByProdutosCategorizadosContainingIgnoreCase(String produtosCategorizados);
	
}
