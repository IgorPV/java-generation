package com.minhaLojaDeGames.LojaDeGames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategoria;
	
	private String tipoDeJogo;
	
	@OneToMany(mappedBy = "categoriaProdutos", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoriaProdutos")
	private List<Produto> produtosCategorizados;

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getTipoDeJogo() {
		return tipoDeJogo;
	}

	public void setTipoDeJogo(String tipoDeJogo) {
		this.tipoDeJogo = tipoDeJogo;
	}

	public List<Produto> getProdutosCategorizados() {
		return produtosCategorizados;
	}

	public void setProdutosCategorizados(List<Produto> produtosCategorizados) {
		this.produtosCategorizados = produtosCategorizados;
	}
	
	
	
	
	
}
