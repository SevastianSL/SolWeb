package com.amontanez.demo.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amontanez.demo.dao.ICategoriaDAO;
import com.amontanez.demo.entity.Categoria;

@Service
public class CategoriaServiceimpl implements ICategoriaService{
	
	@Autowired
	private ICategoriaDAO categoriaDAO;
	
	@Override
	public void save(Categoria categoria) {
		
		categoriaDAO.save(categoria);
		
	}

	@Override
	public List<Categoria> findAll() {
		return (List<Categoria>) categoriaDAO.findAll();
	}
	
	
	
}
