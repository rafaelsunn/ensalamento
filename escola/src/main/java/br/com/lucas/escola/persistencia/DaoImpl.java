package br.com.lucas.escola.persistencia;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.lucas.escola.dao.Dao;

/**
 * 
 * @author Lucas Moreira
 *
 * @param <T>
 * @param <t>
 */

public class DaoImpl<T> implements Dao<T>{

	@PersistenceContext
	private EntityManager manager;
	
	private Class<T> classe;
	
	public DaoImpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		classe = (Class) pt.getActualTypeArguments()[0];
	}
	
	public void persist(T t) {
		manager.persist(t);
	}

	public void merge(T t) {
		manager.merge(t);
	}

	public void delete(T t) {
		manager.remove(t);
	}

	public List<T> getAll() {
		return manager.createQuery("FROM " + classe.getSimpleName()).getResultList();
	}

	public T getPorId(Integer id) {
		return (T) manager.find(classe, id);
	}

}
