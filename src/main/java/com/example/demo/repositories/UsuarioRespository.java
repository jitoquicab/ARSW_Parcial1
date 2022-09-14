package com.example.demo.repositories;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;

import com.example.demo.models.UsuarioModel;
import com.example.demo.models.Response.GenericResponse;
import com.example.demo.services.UsuarioService;

public class UsuarioRespository {
	UsuarioModel user;
	UsuarioService service;
	public ArrayList<UsuarioModel> users;
	public UsuarioRespository() {
		user = new UsuarioModel(1, "David", "david@gamaol", "1");
		users = new ArrayList<>();
		users.add(user);
	}
	public ArrayList<UsuarioModel> findAll() {
		return users;
	}

	public UsuarioModel save(UsuarioModel usuario) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
