package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.UsuarioModel;
import com.example.demo.models.Response.GenericResponse;
import com.example.demo.services.UsuarioService;

@RestController
@RequestMapping("v1/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    /**
     * Permite de obtener los usuarios ya guardados segun la clase UsuarioService
     * @return
     */
    @GetMapping("/repository")
    @RequestMapping(method = RequestMethod.GET)
    public GenericResponse<?> obtenerUsuarios(){
        try {
            return usuarioService.obtenerUsuarios();
        } catch (Exception exception){
            return new GenericResponse<UsuarioModel>(HttpStatus.NOT_FOUND,"Could not find users",false,null);
        }
    }

    /**
     * Permite de hacer una request POST para agregar un usuario. Retorna un usuario si se inserto correctamente, sino lo retorna null
     * @param usuario
     * @return
     */
    @GetMapping("/repository/{usuario}")
    @RequestMapping(method = RequestMethod.POST)
    public GenericResponse<?> guardarUsuario(@RequestBody UsuarioModel usuario){
        try{
            return usuarioService.guardarUsuario(usuario);
        } catch (Exception exception){
            return new GenericResponse<UsuarioModel>(HttpStatus.INTERNAL_SERVER_ERROR,"Couldnt save the user",false,null);
        }
    }

}       

