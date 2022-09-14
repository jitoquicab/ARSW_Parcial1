package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.models.UsuarioModel;
import com.example.demo.models.Response.GenericResponse;
import com.example.demo.services.UsuarioService;

@RestController
@RequestMapping("v1/usuario")
public class UsuarioController {

    //agregamos la etiqueta autowired
    @Autowired
    UsuarioService usuarioServicio;

    //agregamos la etiqueta GetMapping
    @GetMapping("/all")
    public GenericResponse obtenerUsuarios() {
        return usuarioServicio.obtenerUsuarios();
    }

    //agregamos la etiqueta PostMapping
    @PostMapping("/create")
    public GenericResponse<UsuarioModel> guardarUsuario(@RequestBody UsuarioModel usuario) {
        return usuarioServicio.guardarUsuario(usuario);
    }

}
