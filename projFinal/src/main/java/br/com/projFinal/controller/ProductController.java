package br.com.projFinal.controller;

import br.com.projFinal.dao.ProductDao;
import br.com.projFinal.model.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projFinal.model.*;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	private String teste = "/bootstrap/css/bootstrap.min.css";
	
	@Autowired   //injeção de dependencia
	private ProductDao service;
	
	// O método abaixo era para retornar o index, só que o index é retornado automaticamente.
	/*@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<ProductModel> listProducts = service.listall();		
		model.addAttribute("listProducts", listProducts);		
		return "index";
	}*/
	
	@GetMapping("/listar")
	public String listar(Model model) {		
		model.addAttribute("produtos", service.listall());
		model.addAttribute("bootstrap", teste); //Utilizado para teste de URL bootstrap
		return "/product/listar";
	}
	
	@GetMapping("/novo")
	public String novo(Model model) {
		model.addAttribute("produto", new ProductModel());
		return "/product/new_product";
	}
	
	@PostMapping("/salvar")
	public String salvar(ProductModel produto) {
		service.save(produto);
		return "redirect:/product/listar";
	}
	
	@GetMapping("{id}/editar")
	public String editar(@PathVariable("id") Long id, Model model) {
		model.addAttribute("produto", service.get(id));
		return "/product/new_product";
	}
	
	@GetMapping("{id}/excluir")
	public String excluir(@PathVariable("id") Long id, Model model) {
		service.delete(id); 
		return "redirect:/product/listar";
	}
}
