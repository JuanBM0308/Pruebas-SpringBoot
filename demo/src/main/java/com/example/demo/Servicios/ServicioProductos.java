package com.example.demo.Servicios;

import com.example.demo.Entidades.Productos;

import java.util.ArrayList;

public class ServicioProductos {

    private ArrayList<Productos> listado = new ArrayList<>();

    public ServicioProductos() {
        listado.add(new Productos(6,"Piña",3200.0,1,0,"Frutas"));
        listado.add(new Productos(7,"Pechuga De Pollo",5000.0,2,0,"Carnicos"));
        listado.add(new Productos(8,"Zanahoria",2200.0,12,0,"Vegetales"));
        listado.add(new Productos(9,"Papa",1400.0,25,0,"Vegetales"));
        listado.add(new Productos(10,"Costilla De Res",4800.0,5,0,"Carnicos"));
    }

    public ArrayList<Productos> mostrar(){
        return listado;
    }

    public int cantidadProductos(){
        return listado.size();
    }

    public double totalProductos(){
        double total=0;
        double total_compra=0;
        for (int i=0;i<listado.size();i++){
            total = listado.get(i).getPrecio() * listado.get(i).getCantidad();
            listado.get(i).setTotal(total);
            total_compra+=total;
        }
        return total_compra;
    }
}
