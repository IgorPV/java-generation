package integracao.bancodedados.testes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import integracao.bancodedados.testes.model.ContatoModel;
@Repository
public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {
	
}