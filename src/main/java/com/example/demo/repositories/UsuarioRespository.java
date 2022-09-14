package com.example.demo.repositories;

import com.example.demo.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Repository
public interface UsuarioRespository extends CrudRepository<UsuarioModel, Long> {

    UsuarioModel save(UsuarioModel u);
    ArrayList<UsuarioModel> findAll();
    
}
