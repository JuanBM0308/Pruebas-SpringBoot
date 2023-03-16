package com.example.demo.Entidades;

public class Personas {

    private String nombre;
    private String apellido;
    private int edad;

    public Personas(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "\n____\nNombre: " + this.nombre + "\nApellido: " + this.apellido + "\nEdad: " + this.edad + "\n____\n";
    }

}
