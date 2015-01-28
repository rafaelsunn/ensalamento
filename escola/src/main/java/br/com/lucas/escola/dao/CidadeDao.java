package br.com.lucas.escola.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.lucas.escola.model.Cidade;

@Repository
public class CidadeDao {

	@PersistenceContext
	EntityManager manager;
	
	public List<Cidade> findAll() {
		return manager.createQuery("SELECT c FROM Cidade c where c.nomeCidade = 'Brasília'").getResultList();
	}
	
}
