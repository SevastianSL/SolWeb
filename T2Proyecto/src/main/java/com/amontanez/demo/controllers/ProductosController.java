package com.amontanez.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amontanez.demo.entity.Productos;
import com.amontanez.demo.models.service.ICategoriaService;
import com.amontanez.demo.models.service.IProductoService;

@Controller
@RequestMapping("/productos")
public class ProductosController {
	
	@Autowired
	private ICategoriaService categoriaService;
	
	@Autowired
	private IProductoService productosService;
	
	@RequestMapping("/")
	public String inicio(Model model) {
		Productos productos = new Productos();
		model.addAttribute("productos", productos);
		model.addAttribute("listaCategorias", categoriaService.findAll());
		model.addAttribute("listaProductos", productosService.listarProductos());		
		return "productos/index";
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.POST)
	public String guardar(Productos producto) {
		productosService.save(producto);
		return "redirect:/productos/";
	}

}
