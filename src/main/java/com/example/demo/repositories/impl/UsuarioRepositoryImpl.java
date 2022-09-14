package com.example.demo.repositories.impl;

import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.UsuarioRespository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuarioRepositoryImpl implements UsuarioRespository {
    private ArrayList<UsuarioModel> usuarios;

    public UsuarioRepositoryImpl() {
        usuarios = generateUsuarios();
    }


    @Override
    public ArrayList<UsuarioModel> getUsuarios() {
        return usuarios;
    }

    @Override
    public UsuarioModel postUsuario(UsuarioModel usuario) throws Exception {
        if (usuarios.contains(usuario)) throw new Exception("El usuario ya existe");
        usuarios.add(usuario);
        return usuario;
    }

    private ArrayList<UsuarioModel> generateUsuarios() {
        int usrs = 3;
        ArrayList<UsuarioModel> array = new ArrayList<>();
        for (int i = 0; i < usrs; i++) {
            UsuarioModel user = new UsuarioModel("Nombre" + i, "nombre" + i + "@outlook.ocm", "3");
            array.add(user);
        }
        return array;
    }
}
