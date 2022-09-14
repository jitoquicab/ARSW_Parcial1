package com.example.demo.repositories;

import com.example.demo.models.UsuarioModel;

public interface UsuarioRespository {
    public Object findAll();
    public UsuarioModel save(UsuarioModel usuario);
}
