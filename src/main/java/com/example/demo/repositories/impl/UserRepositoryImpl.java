package com.example.demo.repositories.impl;

import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.UsuarioRespository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class UserRepositoryImpl implements UsuarioRespository {

    private ArrayList<UsuarioModel> users = new ArrayList<>();

    public UserRepositoryImpl() {
        UsuarioModel usuarioModel1 = new UsuarioModel(1, "camilo", "Alta", "camilomora117@outlook.com");
        UsuarioModel usuarioModel2 = new UsuarioModel(2, "carlos", "Baja", "carlos@outlook.com");
        UsuarioModel usuarioModel3 = new UsuarioModel(3, "esteban", "Baja", "esteban@outlook.com");
        users.add(usuarioModel1);
        users.add(usuarioModel2);
        users.add(usuarioModel3);
    }

    @Override
    public ArrayList<UsuarioModel> findAll() {
        return users;
    }

    @Override
    public UsuarioModel save(UsuarioModel usuario) {
        users.add(usuario);
        return usuario;
    }

}
