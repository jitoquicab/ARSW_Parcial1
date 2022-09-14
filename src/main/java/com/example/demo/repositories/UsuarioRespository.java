package com.example.demo.repositories;

import com.example.demo.models.Response.GenericResponse;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Repository;
import com.example.demo.models.UsuarioModel;

import java.util.ArrayList;

//@Repository
@Qualifier("inMemory")
public class UsuarioRespository implements usuarioRepository {// extends CrudRepository<UsuarioModel, Long> {

    private ArrayList<UsuarioModel> usuarioModels = new ArrayList<>();

    /**
     * Este metodo retorna la lista de usuarios models
     * @return
     */
    public ArrayList<UsuarioModel> getUsuarioModels() {
        return usuarioModels;
    }

    /**
     * Este metodo permite de retornar un objeto GenericResponse que tiene los elementos de la lista (si hay datos)
     * Sino retorna un GenericResponse con status not found y un mensaje
     * @return
     */
    public GenericResponse<UsuarioModel> findAll() {
        GenericResponse<UsuarioModel> genericResponse = new GenericResponse<>();
        if (usuarioModels.size() > 0) {
            genericResponse.setData(usuarioModels);
            genericResponse.setCode(HttpStatus.ACCEPTED);
            genericResponse.setState(true);
            genericResponse.setMessage("Elements was founded, ok");
        } else {
            genericResponse.setCode(HttpStatus.NOT_FOUND);
            genericResponse.setState(false);
            genericResponse.setMessage("Elements wasn't founded, Not ok");
        }
        return genericResponse;
    }

    /**
     * Este metodo retorna el usuario actualmente agregado
     * @param usuario
     * @return
     */
    public UsuarioModel save(UsuarioModel usuario) {
        usuarioModels.add(usuario);
        return usuario;
    }
}
