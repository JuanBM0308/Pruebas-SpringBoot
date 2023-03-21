package com.example.demo.Servicios;

import com.example.demo.Entidades.Carro;
import java.util.ArrayList;

public class ServicioCarros {

    private ArrayList<Carro> lista_carros = new ArrayList<>();

    public ServicioCarros() {
        lista_carros.add(new Carro("CCB 964","2022","Toyota"));
        lista_carros.add(new Carro("RER 874","2019","BMW"));
        lista_carros.add(new Carro("ZZZ 000","2000","Chevrolet"));
        lista_carros.add(new Carro("AOU 541","2024","Mazda"));
    }

    public ArrayList<Carro> listar_carros() {
        return lista_carros;
    }

    public String AgregarCarros(Carro car) {
        lista_carros.add(car);
        return "Registro Exitoso!";
    }

    public Carro BuscarCarrosPlaca(String placa) {
        Carro car = null;
        for (Carro c:lista_carros) {
            if (c.getPlaca().equals(placa)){
                car = c;
            }
        }
        return car;
    }

    public Carro BuscarCarrosMarca(String marca) {
        Carro car = null;
        for (Carro c:lista_carros) {
            if (c.getMarca().equals(marca)){
                car = c;
            }
        }
        return car;
    }
}
