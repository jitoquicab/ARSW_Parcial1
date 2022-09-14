package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.models.UsuarioModel;
import com.example.demo.models.Response.GenericResponse;
import com.example.demo.repositories.UsuarioRespository;

import java.util.ArrayList;

@Service
public class UsuarioService {
    
    
    @Autowired
    UsuarioRespository usuarioRespository;

    public GenericResponse<ArrayList<UsuarioModel>> getUsuarios(){
        try {
            return new GenericResponse<ArrayList<UsuarioModel>>(HttpStatus.OK,"exitoso",true, usuarioRespository.getUsuarios());
        } catch (Exception exception) {
            return new GenericResponse<ArrayList<UsuarioModel>>(HttpStatus.INTERNAL_SERVER_ERROR,exception.getMessage(),false,null);
        }
    }
    
    public GenericResponse<UsuarioModel> postUsuario(UsuarioModel usuario){
        try {
            return new GenericResponse<UsuarioModel>(HttpStatus.OK,"exitoso",true, usuarioRespository.postUsuario(usuario));
        } catch (Exception exception) {
            return new GenericResponse<UsuarioModel>(HttpStatus.INTERNAL_SERVER_ERROR,exception.getMessage(),false,null);
        }
    }

}
