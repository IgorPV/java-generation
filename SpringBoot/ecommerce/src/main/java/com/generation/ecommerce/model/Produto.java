package com.generation.ecommerce.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;




@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduto;
	
	@NotNull
	private String nomeProduto;
	
	@NotNull
	private float valor;
	
	@Size(max=500)
	private String urlImagem;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Usuario> compradoPor = new ArrayList<>();
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnoreProperties("produtosVendidos")
	private Loja vendidoPor;

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public List<Usuario> getCompradoPor() {
		return compradoPor;
	}

	public void setCompradoPor(List<Usuario> compradoPor) {
		this.compradoPor = compradoPor;
	}

	public Loja getVendidoPor() {
		return vendidoPor;
	}

	public void setVendidoPor(Loja vendidoPor) {
		this.vendidoPor = vendidoPor;
	}
	
	
	
}
