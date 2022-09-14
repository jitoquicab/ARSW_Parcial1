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

    //Agregamos otro autowired para poder vincular la implementación del repositorio
    @Autowired
    UsuarioRespository usuarioRespository;

    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>)usuarioRespository.findAll();
    }

    /**
     * Respuesta generica de actividad HTTP
     * @param usuario usuario que vamos a guardar
     * @return
     */
    public GenericResponse<UsuarioModel> guardarUsuario(UsuarioModel usuario){
        try {
            usuarioRespository.save(usuario);
            return new GenericResponse<UsuarioModel>(HttpStatus.OK,"exitoso",true,usuario);
        } catch (Exception exception) {
            return new GenericResponse<UsuarioModel>(HttpStatus.INTERNAL_SERVER_ERROR,exception.getMessage(),false,null);
        }
    }

}
