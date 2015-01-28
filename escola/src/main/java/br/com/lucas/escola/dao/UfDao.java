package br.com.lucas.escola.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.lucas.escola.model.Uf;

@Repository
public class UfDao {

	@PersistenceContext
	EntityManager manager;
	
	public Uf findByUf(String uf) {
		Uf ufRetornada = new Uf();
		Query query = manager.createQuery("SELECT u FROM Uf u where u.siglaUf = :sigla");
		query.setParameter("sigla", uf);
		List<Uf> lista = query.getResultList();
		if (!lista.isEmpty()) {
			ufRetornada = lista.get(0);
		}
		return ufRetornada;
	}
	
}
