package com.example.demo.repositories;


import com.example.demo.models.UsuarioModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRespository {

    private  List<UsuarioModel> users;

    public UsuarioRespository(){
        users = new ArrayList<UsuarioModel>();
        users.add(new UsuarioModel(1, "Juan", "jaun@escuela.co", "2"));
    }
    public List<UsuarioModel> findAll(){
        return users;
    }

    public UsuarioModel save(UsuarioModel user){
        users.add(user);
        return user;
    }
}
