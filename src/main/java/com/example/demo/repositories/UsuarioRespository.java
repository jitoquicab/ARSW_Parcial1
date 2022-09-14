package com.example.demo.repositories;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

import com.example.demo.models.UsuarioModel;


@Repository
public interface UsuarioRespository {
    
    public ArrayList<UsuarioModel> findAll();

    public UsuarioModel save(UsuarioModel usuario);
}


