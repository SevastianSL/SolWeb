package com.amontanez.demo.models.service;

import java.util.List;

import com.amontanez.demo.entity.Productos;

public interface IProductoService {
	public void save(Productos producto);
	public List<Productos> listarProductos();
}
