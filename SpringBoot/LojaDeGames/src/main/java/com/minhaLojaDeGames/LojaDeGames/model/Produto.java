package com.minhaLojaDeGames.LojaDeGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduto;
	
	private String nomeProduto;
	
	private Long precoProduto;
	
	private String plataforma;
	
	@ManyToOne
	@JoinColumn(name = "idCategoria")
	@JsonIgnoreProperties("produtosCategorizados")
	private Categoria categoriaProdutos;

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Long getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(Long precoProduto) {
		this.precoProduto = precoProduto;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public Categoria getCategoriaProdutos() {
		return categoriaProdutos;
	}

	public void setCategoriaProdutos(Categoria categoriaProdutos) {
		this.categoriaProdutos = categoriaProdutos;
	}
	
	
}
