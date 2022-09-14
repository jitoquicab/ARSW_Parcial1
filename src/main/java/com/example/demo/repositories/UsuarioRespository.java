package com.example.demo.repositories;

import org.springframework.stereotype.Repository;

import com.example.demo.models.UsuarioModel;

import java.util.ArrayList;

@Repository
public interface UsuarioRespository  {

    UsuarioModel save(UsuarioModel usuario);

    ArrayList<UsuarioModel> findAll();
}
