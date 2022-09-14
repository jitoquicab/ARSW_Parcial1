package com.example.demo.services.UsrServiceImpl;

import java.util.ArrayList;

import com.example.demo.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.example.demo.models.UsuarioModel;
import com.example.demo.models.Response.GenericResponse;
import com.example.demo.repositories.UsuarioRespository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    

    @Autowired
    UsuarioRespository usuarioRespository;

    public GenericResponse<ArrayList<UsuarioModel>> obtenerUsuarios(){
        return new GenericResponse<ArrayList<UsuarioModel>>(HttpStatus.OK,"exitoso",true,usuarioRespository.findAll());
    }
    
    public GenericResponse<UsuarioModel> guardarUsuario(UsuarioModel usuario){
        try {
            return new GenericResponse<UsuarioModel>(HttpStatus.OK,"exitoso",true,usuarioRespository.save(usuario));
        } catch (Exception exception) {
            return new GenericResponse<UsuarioModel>(HttpStatus.INTERNAL_SERVER_ERROR,exception.getMessage(),false,null);
        }
    }

}
