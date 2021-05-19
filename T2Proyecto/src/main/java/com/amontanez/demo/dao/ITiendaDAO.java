package com.amontanez.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.amontanez.demo.entity.Tienda;

public interface ITiendaDAO extends CrudRepository<Tienda, Long> {
	
}
