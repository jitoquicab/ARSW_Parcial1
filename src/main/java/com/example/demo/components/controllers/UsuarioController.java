package com.example.demo.components.controllers;

import java.util.List;

import com.example.demo.components.models.Response.GenericResponse;
import com.example.demo.components.models.UsuarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.components.services.UsuarioService;

@RestController
@RequestMapping("v1/usuario")
public class UsuarioController {


    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public GenericResponse<List<UsuarioModel>> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping
    public GenericResponse<UsuarioModel> guardarUsuario(@RequestBody UsuarioModel usuario){
        return usuarioService.guardarUsuario(usuario);
    }

}       

