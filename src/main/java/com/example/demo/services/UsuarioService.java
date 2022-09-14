package com.example.demo.services;

import com.example.demo.models.Response.GenericResponse;
import com.example.demo.models.UsuarioModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

public interface UsuarioService {

    public GenericResponse<ArrayList<UsuarioModel>> obtenerUsuarios();

    public GenericResponse<UsuarioModel> guardarUsuario(UsuarioModel usuario);
}
