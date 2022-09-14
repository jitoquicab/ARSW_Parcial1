package com.example.demo.repositories.URImpl;

import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.UsuarioRespository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public class UsuarioRepositoryImpl implements UsuarioRespository{

    private ArrayList<UsuarioModel> users;
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
