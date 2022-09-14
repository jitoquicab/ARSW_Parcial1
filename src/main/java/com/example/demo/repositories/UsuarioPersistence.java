package com.example.demo.repositories;

import com.example.demo.models.UsuarioModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UsuarioPersistence implements UsuarioRespository{

    private ArrayList<UsuarioModel> usuarios = new ArrayList<>();

    public UsuarioPersistence() {
        usuarios.add(new UsuarioModel(0,"Diego","Diegoruro@gmail.com","10"));
        usuarios.add(new UsuarioModel(1,"Fernado","fernandoruro@gmail.com","4"));
        usuarios.add(new UsuarioModel(2,"Juan","juan@gmail.com","3"));
    }

    @Override
    public ArrayList<UsuarioModel> obtenerUsuarios() {
        return usuarios;
    }

    @Override
    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        usuarios.add(usuario);
        return usuario;
    }
}
