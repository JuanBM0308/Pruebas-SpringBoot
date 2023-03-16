package com.example.demo.Servicios;

import com.example.demo.Entidades.Personas;

import java.util.ArrayList;

public class ServicioPersonas {

    private ArrayList<Personas> ListaPersonas = new ArrayList<>();

    public ServicioPersonas() {
        ListaPersonas.add(new Personas("Pepe","Gomez",22));
        ListaPersonas.add(new Personas("Johan","Lopez",17));
        ListaPersonas.add(new Personas("Carlos","Camacaro",42));
        ListaPersonas.add(new Personas("Maria","Gonzalez",50));
    }

    public ArrayList<Personas> ListaPersonas() {
        return ListaPersonas;
    }

}
