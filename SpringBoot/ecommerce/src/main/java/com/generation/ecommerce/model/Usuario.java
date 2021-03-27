package com.generation.ecommerce.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	
	@NotNull
	@Size(min = 2, max = 45)
	private String nome;
	
	@NotNull
	@Size(min = 5, max = 45)
	private String usuario;
	
	@NotNull
	@Size(min = 6, max = 45)
	private String senha;
	
	@OneToMany(mappedBy = "usuarioCriador", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("usuarioCriador")
	private List<Loja> lojasCriadas;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable( joinColumns = 
						@JoinColumn(name = "fk_idUsuario"),
				inverseJoinColumns =
						@JoinColumn(name = "fk_idLoja"))
	private List<Loja> lojasInscritas;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable( joinColumns = 
						@JoinColumn(name = "fk_idUsuario"),
				inverseJoinColumns = 
						@JoinColumn(name = "fk_idProduto"))
	private List<Produto> produtosComprados;
	
	
	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Loja> getLojasCriadas() {
		return lojasCriadas;
	}

	public void setLojasCriadas(List<Loja> lojasCriadas) {
		this.lojasCriadas = lojasCriadas;
	}

	public List<Loja> getLojasInscritas() {
		return lojasInscritas;
	}

	public void setLojasInscritas(List<Loja> lojasInscritas) {
		this.lojasInscritas = lojasInscritas;
	} 
	
	
	
}
