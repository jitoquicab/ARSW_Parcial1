package com.example.demo.components.services;

import java.util.List;

import com.example.demo.components.models.Response.GenericResponse;
import com.example.demo.components.models.UsuarioModel;
import com.example.demo.components.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UserRepository usuarioRespository;

    public GenericResponse<List<UsuarioModel>> obtenerUsuarios(){
        try{
            return new GenericResponse<List<UsuarioModel>>(HttpStatus.OK,"exitoso",true,usuarioRespository.findAll());
        }catch (Exception e){
            return new GenericResponse<List<UsuarioModel>>(HttpStatus.INTERNAL_SERVER_ERROR,e.getMessage(),false,null);
        }

    }
    
    public GenericResponse<UsuarioModel> guardarUsuario(UsuarioModel usuario){
        try {
            return new GenericResponse<UsuarioModel>(HttpStatus.OK,"exitoso",true,usuarioRespository.save(usuario));
        } catch (Exception exception) {
            return new GenericResponse<UsuarioModel>(HttpStatus.INTERNAL_SERVER_ERROR,exception.getMessage(),false,null);
        }
    }

}
