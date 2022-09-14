package com.example.demo.repositories;

import com.example.demo.models.UsuarioModel;

import java.util.ArrayList;


public interface UsuarioRespository {

    /**
     * Retorna todos los usuarios
     * @return Array de Usuarios
     */
    public ArrayList<UsuarioModel> findAll();

    /**
     * Guarda un Usuario
     * @param usuario new Usuario
     * @return Usuario Model
     */
    public UsuarioModel save(UsuarioModel usuario);

}
