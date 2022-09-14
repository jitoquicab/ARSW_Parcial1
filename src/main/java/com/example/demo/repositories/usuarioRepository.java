package com.example.demo.repositories;

import com.example.demo.models.Response.GenericResponse;
import com.example.demo.models.UsuarioModel;

import java.util.ArrayList;


public interface usuarioRepository {

    ArrayList<UsuarioModel> getUsuarioModels();

    GenericResponse<UsuarioModel> findAll();

    UsuarioModel save(UsuarioModel usuario);

}
