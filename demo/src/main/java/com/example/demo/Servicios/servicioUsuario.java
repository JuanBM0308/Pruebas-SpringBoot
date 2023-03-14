package com.example.demo.Servicios;

import com.example.demo.Entidades.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;

public class servicioUsuario {

    ArrayList<Usuario> lista= new ArrayList<>();

    public servicioUsuario() {
        lista.add(new Usuario(10,"Horacio","Mexico", LocalDate.of(2023,05,18),"Horachopacho@outlook.com"));
        lista.add(new Usuario(11,"Carmela","Bolivia", LocalDate.of(2023,06,20),"mariajiana@gmail.com.com"));
        lista.add(new Usuario(12,"Carlitos","Japon", LocalDate.of(2023,02,28),"carlitos@outlook.com"));
    }

    public ArrayList<Usuario> listar(){
        return lista;
    }

}
