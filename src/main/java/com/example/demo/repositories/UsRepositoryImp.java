package com.example.demo.repositories;

import java.util.ArrayList;

import com.example.demo.models.UsuarioModel;

import org.springframework.stereotype.Service;

@Service
public class UsRepositoryImp implements UsuarioRespository {
    ArrayList<UsuarioModel> usuarios = new ArrayList<UsuarioModel>();

    @Override
    public ArrayList<UsuarioModel> findAll() {
        UsuarioModel user = new UsuarioModel(10, "Norbey", "norbey@gmail.com", "alta");
        usuarios.add(user);
        return usuarios;
    }

    @Override
    public UsuarioModel save(UsuarioModel usuario) {
        UsuarioModel user = usuario;
        this.usuarios.add(user);
        findAll();
        return user;
    }
    
}
