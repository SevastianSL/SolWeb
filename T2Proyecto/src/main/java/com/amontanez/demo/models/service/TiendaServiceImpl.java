package com.amontanez.demo.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amontanez.demo.dao.ITiendaDAO;
import com.amontanez.demo.entity.Tienda;

@Service
public class TiendaServiceImpl implements ITiendaService {

	@Autowired
	private ITiendaDAO tiendaDAO;
	@Override
	public void save(Tienda tienda) {
		tiendaDAO.save(tienda);
	}
	@Override
	public List<Tienda> findAll() {
		
		return (List<Tienda>)tiendaDAO.findAll();
	}

	

	
}
