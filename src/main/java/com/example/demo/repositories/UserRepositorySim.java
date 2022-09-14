package com.example.demo.repositories;

import com.example.demo.models.UsuarioModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class UserRepositorySim {
    //Coleccion de usuarios
    List<UsuarioModel> users = new ArrayList<>();

    /**
     * Constructor con varios usuarios por defecto
     */
    public UserRepositorySim() {
        UsuarioModel user = new UsuarioModel();
        user.setEmail("usuario@mail.com");
        user.setId(1);
        user.setPrioridad("uno");
        user.setNombre("juanito");
        UsuarioModel user2 = new UsuarioModel();
        user2.setEmail("usuario2@mail.com");
        user2.setId(2);
        user2.setPrioridad("dos");
        user2.setNombre("pepito");
        UsuarioModel user3 = new UsuarioModel();
        user3.setEmail("usuario3@mail.com");
        user3.setId(3);
        user3.setPrioridad("tres");
        user3.setNombre("menganito");
        users.add(user);
        users.add(user2);
        users.add(user3);
    }

    /**
     * Agregar un usuario
     * @param id identificador del usuario
     * @param nombre nombre del usuario
     * @param correo correo del usuario
     * @param prioridad prioridad del del usuario
     */
    public void addUser(Long id, String nombre, String correo, String prioridad){
        UsuarioModel user = new UsuarioModel();
        user.setEmail(correo);
        user.setId(id);
        user.setPrioridad(prioridad);
        user.setNombre(nombre);
        users.add(user);
    }

    /**
     * Añade un objeto usuario
     * @param usuarioModel objeto usuario para añadir
     */
    public void addUserObject(UsuarioModel usuarioModel){
        users.add(usuarioModel);
    }

    /**
     * Retorna la colección de usuarios
     * @return
     */
    public List<UsuarioModel> getUsers(){
        return users;
    }

}