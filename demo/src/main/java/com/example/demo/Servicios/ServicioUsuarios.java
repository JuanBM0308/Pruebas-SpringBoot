package com.example.demo.Servicios;

import com.example.demo.Entidades.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;

public class ServicioUsuarios {

    ArrayList<Usuario> lista = new ArrayList<>();

    public ServicioUsuarios(){
        lista.add(new Usuario(10,"Pedro","Mexico", LocalDate.of(1990,5,20),"pedro@gmail.com"));
        lista.add(new Usuario(11,"Carolina","Polonia", LocalDate.of(2000,8,12),"carolina@gmail.com"));
        lista.add(new Usuario(12,"Ramon","USA", LocalDate.of(1999,12,31),"ramon@gmail.com"));
    }

    public ArrayList<Usuario> listar(){
        return lista;
    }

    public String AgregarUsuario (Usuario usu) {
        lista.add(usu);
        return "Registro Exitoso";
    }

    public Usuario buscarUsuario(int codigo){
        Usuario usu = null;
        for (Usuario u: lista) {
            if(u.getId()==codigo){
                usu = u;
            }
        }
        return usu;
    }
}
