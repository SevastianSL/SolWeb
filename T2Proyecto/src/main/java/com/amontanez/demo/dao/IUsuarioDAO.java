package com.amontanez.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.amontanez.demo.entity.Usuario;

public interface IUsuarioDAO extends CrudRepository<Usuario, Long>{

}
