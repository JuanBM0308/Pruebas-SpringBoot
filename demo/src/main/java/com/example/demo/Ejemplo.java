package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Scanner;

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

    @GetMapping("/array")
    public ArrayList ejemplo() {
        Scanner op = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<String>();

        System.out.print("Nombre de la persona: ");
        String nombre = op.next();

        System.out.print("Apellido de la persona: ");
        String apellido = op.next();

        System.out.print("Edad de la persona: ");
        int edad = op.nextInt();

        Personas persona1 = new Personas(nombre,apellido,edad);

        nombres.add(String.valueOf(persona1));
        System.out.println(persona1.toString());

        /*
        nombres.add("Johan");
        nombres.add("Dom Pepe");
        nombres.add("Joey");
        nombres.add("Carlos Camacaro");
        */

        return nombres;
    }
}