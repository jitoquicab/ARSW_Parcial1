package com.example.demo.components.repositories;

import com.example.demo.components.models.UsuarioModel;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserRepository {

    List<UsuarioModel> findAll();

    UsuarioModel save(UsuarioModel usuario);
}
