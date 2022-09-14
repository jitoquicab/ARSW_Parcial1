package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.models.UsuarioModel;


public interface UsuarioRespository extends CrudRepository<UsuarioModel, Long> {
    
}
