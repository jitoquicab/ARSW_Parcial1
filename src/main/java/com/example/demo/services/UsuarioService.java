package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.models.UsuarioModel;
import com.example.demo.models.Response.GenericResponse;
import com.example.demo.repositories.UserRespository;

@Service
public class UsuarioService {

    //agregamos la etiqueta autowired
    @Autowired
    UserRespository usuarioRespository;

    public GenericResponse<List<UsuarioModel>> obtenerUsuarios() {
        return new GenericResponse<List<UsuarioModel>>(HttpStatus.OK, "OK", true, usuarioRespository.findAll());
    }

    public GenericResponse<UsuarioModel> guardarUsuario(UsuarioModel usuario) {
        try {
            return new GenericResponse<UsuarioModel>(HttpStatus.OK, "exitoso", true, usuarioRespository.save(usuario));
        } catch (Exception exception) {
            return new GenericResponse<UsuarioModel>(HttpStatus.INTERNAL_SERVER_ERROR, exception.getMessage(), false, null);
        }
    }

}
