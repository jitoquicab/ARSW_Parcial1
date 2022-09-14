package com.example.demo.repositories;


import com.example.demo.models.UsuarioModel;

public interface UsuarioRespository {

    Object findAll();

    UsuarioModel save(UsuarioModel usuario);
}
