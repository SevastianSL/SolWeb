package com.amontanez.demo.models.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amontanez.demo.dao.IUsuarioDAO;
import com.amontanez.demo.entity.Usuario;

@Service
public class UsuarioServiceimpl implements IUsuarioService{

	@Autowired
	private IUsuarioDAO usuarioDAO;
	
	@Override
	public void save(Usuario usuario) {
		
		usuarioDAO.save(usuario);
	}

	@Override
	public List<Usuario> findAll() {
		
		return (List<Usuario>)usuarioDAO.findAll();
	}

	

	

	

}
