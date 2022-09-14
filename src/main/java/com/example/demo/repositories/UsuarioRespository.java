package com.example.demo.repositories;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import com.example.demo.models.UsuarioModel;

@Repository
public class UsuarioRespository{
    
    public ArrayList<UsuarioModel> usuarios = new ArrayList<UsuarioModel>();

    public UsuarioRespository(){
        inicializarUsuarios();
    }

    public void inicializarUsuarios(){
        UsuarioModel uno = new UsuarioModel(3,"javier","jtoquicab@outlook.com","1");
        usuarios.add(uno);
        UsuarioModel dos = new UsuarioModel(4,"Laura","laura1@outlook.com","2");
        usuarios.add(dos);
        UsuarioModel tres = new UsuarioModel(5,"Laura","laura2@outlook.com","2");
        usuarios.add(tres);
    }
    public ArrayList<UsuarioModel> findAll(){
        return usuarios;
    }

    public ArrayList<UsuarioModel> save(UsuarioModel usuario){
        usuarios.add(usuario);
        return usuarios;
    }

}
