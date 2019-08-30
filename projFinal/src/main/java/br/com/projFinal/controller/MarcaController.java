package br.com.projFinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projFinal.dao.MarcaDao;
import br.com.projFinal.model.MarcaModel;

@Controller
@RequestMapping("/marca")
public class MarcaController {
	
	@Autowired
	private MarcaDao service;
	
	@GetMapping("/listar")
	private String listar(Model model) {
		model.addAttribute("marcas", service.listall());
		return "/marca/listar";
	}

	@GetMapping("/novo")
	private String novo(Model model) {
		model.addAttribute("marca", new MarcaModel());
		return "/marca/new_marca";
	}
	
	@PostMapping("/salvar")
	private String salvar(MarcaModel marca) {
		service.save(marca);
		return "redirect:/marca/listar";
	}
}
