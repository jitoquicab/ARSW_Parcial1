package com.example.demo.repositories;

import com.example.demo.models.UsuarioModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioRepositoryImpl implements UsuarioRespository {

    UserRepositorySim repositorySim = new UserRepositorySim();

    /**
     * Nos retorna todos los usuarios en el repositorio
     * @return Lista dinamica con los usuarios del repositorio
     */
    @Override
    public List<UsuarioModel> findAll() {
        return repositorySim.getUsers();
    }

    /**
     * Nos permite guardar un usuario en el repositorio
     * @param usuario Usuario que vamos a guardar en el repositorio
     * @return Usuario guardado
     */
    @Override
    public UsuarioModel save(UsuarioModel usuario) {
        repositorySim.addUserObject(usuario);
        return usuario;
    }

}