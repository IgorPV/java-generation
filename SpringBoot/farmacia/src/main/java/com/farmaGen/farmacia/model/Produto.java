package com.farmaGen.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduto;
	
	@NotNull
	@Size(min = 3, max = 30)
	private String nomeProduto;
	
	@NotNull
	private Long precoProduto;
	
	@ManyToOne
	@JsonIgnoreProperties({"produtosCategorizados"})
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

	public Categoria getCategoriaProdutos() {
		return categoriaProdutos;
	}

	public void setCategoriaProdutos(Categoria categoriaProdutos) {
		this.categoriaProdutos = categoriaProdutos;
	}
	
	
}
