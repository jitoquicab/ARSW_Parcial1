package com.example.demo.repositories;

import com.example.demo.models.UsuarioModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class UsuarioRespositoryImp implements  UsuarioRespository{
    HashMap<String, UsuarioModel> data = new HashMap<String, UsuarioModel>();
    public UsuarioRespositoryImp() {
        UsuarioModel us1 = new UsuarioModel();
        us1.setId(1);
        us1.setNombre("james");
        us1.setEmail("james@mamma");
        us1.setPrioridad("Alta");
        UsuarioModel us2 = new UsuarioModel();
        us2.setId(1);
        us2.setNombre("dani");
        us2.setEmail("dani@mamma");
        us2.setPrioridad("Alta");
        data.put(us1.getNombre(), us1);
        data.put(us2.getNombre(), us2);
    }

    public Object findAll() {
        ArrayList<UsuarioModel> ar = new ArrayList<>();
        for (String us:data.keySet()) {
            ar.add(data.get(us));
            System.out.println(us);
        }
        return ar;
    }

    public UsuarioModel save(UsuarioModel usuario) {
        data.put(usuario.getEmail(), usuario);
        return  usuario;
    }
}
