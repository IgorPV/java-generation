package com.generation.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.ecommerce.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
	
	@Query(value = "SELECT * FROM usuario INNER JOIN loja on usuario.id_usuario = loja.usuario_criador_id_usuario WHERE usuario.nome = :usuario", nativeQuery = true)
	public List<Usuario> findAllByUsuarioLojaContainingIgnoreCase(@Param("usuario") String usuario);
	
	public boolean existsByNomeContainingIgnoreCase(String nome);
	
}
