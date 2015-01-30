package br.com.lucas.escola.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.lucas.escola.model.Cargo;
import br.com.lucas.escola.services.CargoService;
import br.com.lucas.escola.util.Util;


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
	public String salvar(@Valid Cargo cargo, BindingResult result, Model model, HttpSession session) {
		if (result.hasErrors()) {
			return "cargo/cadastrar-cargo";
		}
		if (cargo.getIdCargo() == null || cargo.getIdCargo() == 0) {
			cargoService.persist(cargo);
			session.setAttribute("mensagem", Util.retornaMensagem("cargo.adicionado.sucesso"));
		} else {
			cargoService.merge(cargo);
			session.setAttribute("mensagem", Util.retornaMensagem("cargo.alterado.sucesso"));
		}
		return "redirect: listar";
	}
	
	/**
	 * Encaminha o usuario para o formulario de cadastro de cargo 
	 */
	@RequestMapping(value = "/novo", method = RequestMethod.GET)
	public String novo() {
		return "cargo/cadastrar-cargo";
	}
	
	/**
	 * Encaminha para a listagem de cargos 
	 */
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar(Model model, HttpSession session) {
		if (session.getAttribute("mensagem") != null) {
			model.addAttribute("mensagem", session.getAttribute("mensagem"));
			session.setAttribute("mensagem", null);
		}
		model.addAttribute("cargos", cargoService.getAll());
		return "cargo/listar-cargos";
	}
	
	@RequestMapping(value = "/editar/{id}", method = RequestMethod.GET)
	public String editar(@PathVariable int id, Model model, HttpSession session) {
		Cargo cargo = cargoService.getPorId(id);
		if (cargo != null) {
			model.addAttribute("cargo", cargo);
		}
		return "cargo/cadastrar-cargo";
	}
	
	@RequestMapping(value = "/excluir/{id}", method = RequestMethod.GET)
	public String excluir(@PathVariable int id, Model model, HttpSession session) {
		Cargo cargo = cargoService.getPorId(id);
		if (cargo != null) {
			cargoService.delete(cargo);
		}
		return "redirec: listar";
	}
	
}
