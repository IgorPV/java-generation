package com.farmaGen.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategoria;
	
	@NotNull
	@Size(min =3, max =30)
	private String nomeCategoria;
	
	@OneToMany(mappedBy= "categoriaProdutos",cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoriaProdutos")
	private List<Produto> produtosCategorizados;

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public List<Produto> getProdutosCategorizados() {
		return produtosCategorizados;
	}

	public void setProdutosCategorizados(List<Produto> produtosCategorizados) {
		this.produtosCategorizados = produtosCategorizados;
	}
	
		
	
	
}
