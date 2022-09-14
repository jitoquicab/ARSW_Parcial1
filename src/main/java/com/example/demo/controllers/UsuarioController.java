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

    //Agregamos el @Autowired para que pueda hacer correctamente la inyección de dependencias y se pueda vincular un Servicio
    @Autowired
    UsuarioService usuarioService;

    /**
     * Metodo que nos retorna todos los usuarios
     * @return json con los usuarios
     */
    @RequestMapping(method = RequestMethod.GET)
    public GenericResponse<?> obtenerUsuarios(){
        return new GenericResponse<>(HttpStatus.ACCEPTED,"Aceptado",true,usuarioService.obtenerUsuarios());
    }

    /**
     * Añadir un usuario de la forma {
     *             "id": 4,
     *             "nombre": "menganito",
     *             "email": "usuario3@mail.com",
     *             "prioridad": "tres"
     *         }
     * @param usuario
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public GenericResponse<UsuarioModel> guardarUsuario(@RequestBody UsuarioModel usuario){
        return usuarioService.guardarUsuario(usuario);
    }

}


