package com.example.demo.repositories;

import org.springframework.stereotype.Repository;

import com.example.demo.models.UsuarioModel;

import java.util.ArrayList;


public interface UsuarioRespository {
    public ArrayList<UsuarioModel> findAll();


    public UsuarioModel save(UsuarioModel usuario);
}
