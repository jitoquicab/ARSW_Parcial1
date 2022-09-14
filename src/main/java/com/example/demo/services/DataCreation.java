package com.example.demo.services;

import com.example.demo.models.UsuarioModel;

import java.util.ArrayList;

public class DataCreation implements com.example.demo.repositories.DataUsers {
    @Override
    public UsuarioModel getUser() {
        return UsuarioModel;
    }

    @Override
    public void save(UsuarioModel) {
    }

    @Override
    public ArrayList<UsuarioModel> findAll() {
        ArrayList<UsuarioModel> finded= new ArrayList<UsuarioModel>();
        return finded;
    }

    @Override
    public void DataUsers() {

    }

    @Override
    public void get() {

    }
}
