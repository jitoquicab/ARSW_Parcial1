package com.example.demo.models;

public class UsuarioModel {

    private long id;

    private String nombre;
    private String email;
    private String prioridad;
    public UsuarioModel(int i, String string, String string2, String string3) {
		this.id=i;
		this.nombre=string;
		this.email=string2;
		this.prioridad=string3;
	}
	public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
}
