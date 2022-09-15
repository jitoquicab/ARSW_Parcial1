package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.UsuarioModel;
import com.example.demo.models.Response.GenericResponse;
import com.example.demo.services.UsuarioService;

@RestController
@RequestMapping("v1/usuario")
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;

    @RequestMapping(value = "obtenerUsuarios", method = RequestMethod.GET)
    public GenericResponse<UsuarioModel> obtenerUsuarios(){
        try {
            return usuarioService.obtenerUsuarios();
        }catch (Exception ex){
            return new GenericResponse<>(HttpStatus.NOT_FOUND, "No se pudo consultar", false, null);
        }
    }

    @RequestMapping(value = "agregarusuario", method = RequestMethod.POST)
    public GenericResponse<UsuarioModel> guardarUsuario(@RequestBody UsuarioModel usuario){
        try {
            return usuarioService.guardarUsuario(usuario);
        }catch(Exception ex){
            return new GenericResponse<>(HttpStatus.NOT_FOUND, "No se pudo consultar", false, null);
        }
    }

}       

