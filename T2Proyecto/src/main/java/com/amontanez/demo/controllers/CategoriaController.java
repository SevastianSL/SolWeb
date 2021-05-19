package com.amontanez.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amontanez.demo.entity.Categoria;
import com.amontanez.demo.models.service.ICategoriaService;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
    private ICategoriaService categoriaService;
	
	@RequestMapping("/")
	public String inicio(Model model) {
		Categoria categoria = new Categoria();
		model.addAttribute("categoria", categoria);
		model.addAttribute("listaCategorias", categoriaService.findAll());
		return "categoria/index";
	}
	
	  @RequestMapping(value= "/form", method= RequestMethod.POST)
	    public String guardar(Categoria categoria) {
	        categoriaService.save(categoria);
	        return "redirect:/categoria/";
	    }
}
