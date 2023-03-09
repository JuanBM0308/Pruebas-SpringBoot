package com.example.demo.Servicios;

import com.example.demo.Entidades.Productos;

import java.util.ArrayList;

public class servicioProductos {

    private ArrayList<Productos> lista = new ArrayList<>();

    public servicioProductos(){
        lista.add(new Productos(1,"Durazno",30000,10,0,"Frutas"));
        lista.add(new Productos(2,"Piña",4000,30,0,"Frutas"));
        lista.add(new Productos(3,"Leche",15000,5,0,"Lacteos"));
        lista.add(new Productos(4,"Arroz",10000,20,0,"Granos"));
        lista.add(new Productos(5,"Frijol",11000,25,0,"Granos"));
    }


    public ArrayList<Productos> mostrar(){
        return lista;
    }

    public int cantidad(){
        return lista.size();
    }

    public ArrayList<Productos> total(){
        double total = 0;
        for (int x = 0;x<lista.size();x++) {
            total = lista.get(x).getPrecio() * lista.get(x).getCantidad();
            lista.get(x).setTotal(total);
        }
        return lista;
    }

}
