package com.amontanez.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.amontanez.demo.entity.Tienda;
import com.amontanez.demo.models.service.ITiendaService;

@Controller
@RequestMapping("/tienda")
public class TiendaController {
	
	//instancia para que funcione el RequestMethod.POST(GUARDAR)
	@Autowired
	private ITiendaService tiendaService;
	
	@RequestMapping("/")
	public String inicio(Model model) {
		Tienda tienda= new Tienda();
		model.addAttribute("listaTiendas",tiendaService.findAll());
		model.addAttribute("tienda",tienda);
		return "tienda/index";
	}
	
	//esto es el guardar
	@RequestMapping(value= "/form", method= RequestMethod.POST)
	public String guardar(Tienda tienda) {
		tiendaService.save(tienda);
		return "redirect:/tienda/";
	}
}