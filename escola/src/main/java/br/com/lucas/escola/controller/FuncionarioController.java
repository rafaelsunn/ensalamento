package br.com.lucas.escola.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.lucas.escola.dao.CidadeDao;
import br.com.lucas.escola.dao.UfDao;
import br.com.lucas.escola.model.Funcionario;

/**
 * 
 * @author Lucas Moreira
 *
 */

@Controller
@RequestMapping(value = "/funcionario/**")
public class FuncionarioController {

	@Autowired
	private CidadeDao cidadeoDao;
	
	@Autowired
	private UfDao ufDao;
	
	@RequestMapping(value = "/novo", method = RequestMethod.GET)
	public String novo(Model model) {
		
		model.addAttribute("cidades", cidadeoDao.findAll());
		model.addAttribute("uf", ufDao.findByUf("DF"));
		
		return "funcionario/cadastrar-funcionario";
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.GET)
	public String save(@Valid Funcionario funcionaro) {
		return null;
	}
	
}
