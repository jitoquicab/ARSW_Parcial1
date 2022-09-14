package com.example.demo.controllers;

import java.util.ArrayList;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.UsuarioModel;
import com.example.demo.models.Response.GenericResponse;
import com.example.demo.services.UsuarioService;

@RestController
@RequestMapping("v1/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public GenericResponse<ArrayList<UsuarioModel>> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @RequestMapping(method = RequestMethod.POST)
    public GenericResponse<UsuarioModel> guardarUsuario(@RequestBody String usuario){
        System.out.println(usuario);
        UsuarioModel usuarioModel = new Gson().fromJson(usuario,UsuarioModel.class);
        System.out.println(usuarioModel.getId());
        System.out.println(usuarioModel.getNombre());
        return usuarioService.guardarUsuario(usuarioModel);
    }

}       

