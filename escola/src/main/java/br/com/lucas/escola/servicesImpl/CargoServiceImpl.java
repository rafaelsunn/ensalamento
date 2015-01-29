package br.com.lucas.escola.servicesImpl;

import java.util.List;

import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lucas.escola.model.Cargo;
import br.com.lucas.escola.persistencia.CargoDaoImpl;
import br.com.lucas.escola.services.CargoService;

@Service
public class CargoServiceImpl implements CargoService {

	@Autowired
	private CargoDaoImpl dao;
	
	public void persist(Cargo t) {
		dao.persist(t);
	}

	public void merge(Cargo t) {
		dao.merge(t);
	}

	public void delete(Cargo t) {
		dao.delete(t);
	}

	public List<Cargo> getAll() {
		return dao.getAll();
	}

	public Cargo getPorId(Integer id) {
		return dao.getPorId(id);
	}

}
