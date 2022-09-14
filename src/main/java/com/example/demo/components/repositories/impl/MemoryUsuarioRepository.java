package com.example.demo.components.repositories.impl;

import com.example.demo.components.models.UsuarioModel;
import com.example.demo.components.repositories.UserRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Repository
@Service
public class MemoryUsuarioRepository implements UserRepository {

    private final List<UsuarioModel> memory = new ArrayList<>();

    public MemoryUsuarioRepository(){
        UsuarioModel user = new UsuarioModel(1,"Carlos","cjot60@gmail.com","alta");
        memory.add(user);
    }
    @Override
    public List<UsuarioModel> findAll() {
        return this.memory;
    }

    @Override
    public UsuarioModel save(UsuarioModel usuario) {
        memory.add(usuario);
        return usuario;
    }
}
