package org.generation.blogPessoal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min=5,max=100)
	private String nome;
	
	@NotNull
	@Size(min=5,max=100)
	private String usuario;
	
	@NotNull
	@Size(min=5)
	private String senha;
	
	@OneToMany(mappedBy = "criadoPor", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("criadoPor")
	private List<Postagens> postagensCriadas;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public List<Postagens> getPostagensCriadas() {
		return postagensCriadas;
	}

	public void setPostagensCriadas(List<Postagens> postagensCriadas) {
		this.postagensCriadas = postagensCriadas;
	}
	
	
	
}
