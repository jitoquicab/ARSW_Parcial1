package com.example.demo.repositories;

import org.springframework.stereotype.Repository;

import com.example.demo.models.UsuarioModel;

import java.util.ArrayList;

@Repository
public interface UsuarioRespository {

    public ArrayList<UsuarioModel> getUsuarios();

    public UsuarioModel postUsuario(UsuarioModel usuario) throws Exception;
}
