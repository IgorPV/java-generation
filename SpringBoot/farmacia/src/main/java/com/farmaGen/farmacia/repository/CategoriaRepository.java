package com.farmaGen.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmaGen.farmacia.model.Categoria;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	public List<Categoria> findAllByNomeCategoriaContaining(String nomeCategoria);
	
	public List<Categoria> findAllByProdutosCategorizadosContainingIgnoreCase(String produtosCategorizados);
}
