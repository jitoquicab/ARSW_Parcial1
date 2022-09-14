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

    /**
     * Metodo para obtener todos los usuarios
     * @return ArrayList de UsuariosModels
     */
    public GenericResponse<ArrayList<UsuarioModel>> obtenerUsuarios(){
        return new GenericResponse<ArrayList<UsuarioModel>>(HttpStatus.OK,"exitoso",true,usuarioRespository.findAll());
    }

    /**
     * Metodo para guardar un usuario
     * @param usuario new User
     * @return Usuario que se guardo
     */
    public GenericResponse<UsuarioModel> guardarUsuario(UsuarioModel usuario){
        try {
            return new GenericResponse<UsuarioModel>(HttpStatus.OK,"exitoso",true,usuarioRespository.save(usuario));
        } catch (Exception exception) {
            return new GenericResponse<UsuarioModel>(HttpStatus.INTERNAL_SERVER_ERROR,exception.getMessage(),false,null);
        }
    }

}
