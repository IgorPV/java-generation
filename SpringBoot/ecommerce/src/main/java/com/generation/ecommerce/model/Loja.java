package com.generation.ecommerce.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class Loja {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLoja;
	
	@NotNull
	@Size(min=5, max=45)
	private String nomeLoja;
	
	@NotNull
	@Size(min=5, max=100)
	private String descricao;
	
	@ManyToOne
	@JsonIgnoreProperties({"lojasCriadas"})
	private Usuario usuarioCriador;


	@ManyToMany(mappedBy = "lojasInscritas",cascade = CascadeType.ALL)
	private List<Usuario> usuariosInscritos;
	
	@OneToMany(mappedBy = "vendidoPor",cascade = CascadeType.ALL)
	@JsonIgnoreProperties("vendidoPor")
	private List<Produto> produtosVendidos;
	
	
	public Long getIdLoja() {
		return idLoja;
	}

	public void setIdLoja(Long idLoja) {
		this.idLoja = idLoja;
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Usuario getUsuarioCriador() {
		return usuarioCriador;
	}

	public void setUsuarioCriador(Usuario usuarioCriador) {
		this.usuarioCriador = usuarioCriador;
	}

	public List<Usuario> getUsuariosInscritos() {
		return usuariosInscritos;
	}

	public void setUsuariosInscritos(List<Usuario> usuariosInscritos) {
		this.usuariosInscritos = usuariosInscritos;
	}
	
	
	
}
