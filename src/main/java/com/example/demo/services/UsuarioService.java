package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.models.UsuarioModel;
import com.example.demo.models.Response.GenericResponse;
import com.example.demo.repositories.UsuarioRespository;


@Service
public class UsuarioService {

    @Autowired
    UsuarioRespository usuarioRespository;

    GenericResponse genericResponse;

    public GenericResponse<UsuarioModel> obtenerUsuarios(){
        try {
            return new GenericResponse<UsuarioModel>(HttpStatus.OK,"exitoso",true,usuarioRespository.findAll());
        } catch (Exception exception) {
            return new GenericResponse<UsuarioModel>(HttpStatus.INTERNAL_SERVER_ERROR,exception.getMessage(),false,null);
        }
    }

    public GenericResponse<UsuarioModel> guardarUsuario(UsuarioModel usuario){
        try {
            genericResponse.getData().add(usuario);
            //return new GenericResponse<UsuarioModel>(HttpStatus.OK,"exitoso",true,usuarioRespository.save(usuario));
            return new GenericResponse<UsuarioModel>(HttpStatus.OK,"exitoso",true,genericResponse.getData());
        } catch (Exception exception) {
            return new GenericResponse<UsuarioModel>(HttpStatus.INTERNAL_SERVER_ERROR,exception.getMessage(),false,null);
        }
    }

}
