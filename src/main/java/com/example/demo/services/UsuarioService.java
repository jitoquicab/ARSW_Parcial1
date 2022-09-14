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

    public GenericResponse<ArrayList<UsuarioModel>> obtenerUsuarios(){
        try {
            return new GenericResponse<ArrayList<UsuarioModel>>(HttpStatus.OK,"exitoso",true,usuarioRespository.obtenerUsuarios());
        } catch (Exception exception) {
            return new GenericResponse<ArrayList<UsuarioModel>>(HttpStatus.INTERNAL_SERVER_ERROR,exception.getMessage(),false,null);
        }
    }
    
    public GenericResponse<UsuarioModel> guardarUsuario(UsuarioModel usuario){
        try {
            return new GenericResponse<UsuarioModel>(HttpStatus.OK,"exitoso",true,usuarioRespository.guardarUsuario(usuario));
        } catch (Exception exception) {
            return new GenericResponse<UsuarioModel>(HttpStatus.INTERNAL_SERVER_ERROR,exception.getMessage(),false,null);
        }
    }

}
