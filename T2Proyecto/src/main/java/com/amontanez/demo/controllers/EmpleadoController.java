package com.amontanez.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amontanez.demo.entity.Empleado;
import com.amontanez.demo.models.service.IEmpleadoService;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {
	
	@Autowired
	private IEmpleadoService empleadoService;
	@RequestMapping("/")
	public String inicio(Model model) {
		Empleado empleado = new Empleado();
		model.addAttribute("empleado", empleado);
		model.addAttribute("listaEmpleado", empleadoService.findAll());
		return "empleado/index";
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String guardar(Empleado empleado) {
		empleadoService.save(empleado);
		return "redirect:/empleado/";
	}
	
	
}
