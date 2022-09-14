package com.example.demo.repositories.impl;
import com.example.demo.models.RepositorySim.UserRepositorySim;
import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.UsuarioRespository;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Clase implementación de un repositorio de usuarios, esta clase es un bean que vamos a inyectar en UsuarioService
 */
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
