package com.example.demo.repositories;

import com.example.demo.models.UsuarioModel;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRespository {

    //Hacemos la implementación de la clase 
    private List<UsuarioModel> usuarios;

    public UserRespository() {
        usuarios = new ArrayList<UsuarioModel>();
        usuarios.add(new UsuarioModel(1, "Sebastian", "sebastian@mail.escuelaing.edu.co", "1"));
        usuarios.add(new UsuarioModel(1, "jaime", "jaime@mail.escuelaing.edu.co", "2"));
        usuarios.add(new UsuarioModel(1, "Nicolas", "nicolas@mail.escuelaing.edu.co", "3"));
        usuarios.add(new UsuarioModel(1, "Camilo", "camio@mail.escuelaing.edu.co", "4"));
        usuarios.add(new UsuarioModel(1, "Andres", "andres@mail.escuelaing.edu.co", "5"));
    }

    public List<UsuarioModel> findAll() {
        return usuarios;
    }

    public UsuarioModel save(UsuarioModel user) {
        usuarios.add(user);
        return user;
    }
}
