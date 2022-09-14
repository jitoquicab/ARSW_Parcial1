package com.example.demo.repositories.impl;

import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.UsuarioRespository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class InmemoryPersistence implements UsuarioRespository {
    ArrayList<UsuarioModel> usu = new ArrayList<>();

    public InmemoryPersistence() {
        usu.add(new UsuarioModel(1,"val","je@hotm.com","alta"));
    }

    @Override
    public UsuarioModel save(UsuarioModel usuario) {
        usu.add(usuario);
        for (UsuarioModel u:usu) {
            if(u.equals(usuario)){
                return u;
            }
        }
        return null;
    }

    @Override
    public ArrayList<UsuarioModel> findAll() {
        return usu;
    }
}
