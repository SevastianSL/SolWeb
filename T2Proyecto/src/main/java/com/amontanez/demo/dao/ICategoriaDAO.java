package com.amontanez.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.amontanez.demo.entity.Categoria;

public interface ICategoriaDAO extends CrudRepository<Categoria, Long>{

}
