package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Ejemplo {

    @GetMapping("/hola_mundo")
    public String hola() {
        return "Hola Juan!";
    }

    @GetMapping("/suma")
    public int suma() {
        int x=2;
        int y=5;
        return x+y;
    }

    @GetMapping("/arreglo")
    public ArrayList RetornarArreglo () {
        ArrayList vendidos = new ArrayList();
        Carro carro1 = new Carro("CCB 964","2022","Toyota");
        Carro carro2 = new Carro("RER 874","2019","BMW");
        Carro carro3 = new Carro("ZZZ 000","2000","Chevrolet");
        Carro carro4 = new Carro("AOU 541","2024","Mazda");
        vendidos.add(carro1);
        vendidos.add(carro2);
        vendidos.add(carro3);
        vendidos.add(carro4);
        return vendidos;
    }
}