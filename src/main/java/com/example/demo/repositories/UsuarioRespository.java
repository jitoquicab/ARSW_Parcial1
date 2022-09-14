package com.example.demo.repositories;

import com.example.demo.models.UsuarioModel;

import java.util.ArrayList;

public interface UsuarioRespository {

    public ArrayList<UsuarioModel> obtenerUsuarios();

    public UsuarioModel guardarUsuario(UsuarioModel usuario);
}
