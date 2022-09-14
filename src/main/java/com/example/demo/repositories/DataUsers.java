package com.example.demo.repositories;

import com.example.demo.models.UsuarioModel;

import java.util.ArrayList;

public interface DataUsers {
    public void DataUsers();
    public void get();
    public ArrayList<UsuarioModel> findAll();
    public void save();

}
