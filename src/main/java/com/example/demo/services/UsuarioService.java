package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.repositories.DataUsers;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.models.UsuarioModel;
import com.example.demo.models.Response.GenericResponse;
import com.example.demo.repositories.DataUsers;

@Service
@Repository
public class UsuarioService {
    
    
    DataUsers DataUsers;

    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>)DataUsers.findAll();
    }
    
    public GenericResponse<UsuarioModel> guardarUsuario(UsuarioModel usuario){
        try {
            return new GenericResponse<UsuarioModel>(HttpStatus.OK,"exitoso",true,DataUsers.save(UsuarioModel));
        } catch (Exception exception) {
            return new GenericResponse<UsuarioModel>(HttpStatus.INTERNAL_SERVER_ERROR,exception.getMessage(),false,null);
        }
    }

}
