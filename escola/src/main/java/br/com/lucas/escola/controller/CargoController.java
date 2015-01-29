package br.com.lucas.escola.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.lucas.escola.model.Cargo;
import br.com.lucas.escola.services.CargoService;


@Controller
@RequestMapping(value = "/cargo/**")
@Transactional
public class CargoController {

	@Autowired
	private CargoService cargoService;
	
	/**
	 * Salva um registro de cargo
	 */
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public String salvar(@Valid Cargo cargo, BindingResult result) {
		if (result.hasErrors()) {
			return "cargo/cadastrar-cargo";
		}
		cargoService.persist(cargo);
		// TODO Validar se esse é o melhor retorno
		return "home";
	}
	
	/**
	 * Encaminha o usuario para o formulario de cadastro de cargo 
	 */
	@RequestMapping(value = "/novo", method = RequestMethod.GET)
	public String novo() {
		return "cargo/cadastrar-cargo";
	}
	
}
