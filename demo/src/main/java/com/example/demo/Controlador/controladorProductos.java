package com.example.demo.Controlador;


import com.example.demo.Entidades.Productos;
import com.example.demo.Servicios.servicioProductos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class controladorProductos {

    servicioProductos servicio = new servicioProductos();

    @GetMapping("/listaProductos")
    public ArrayList<Productos> listar(){
        return servicio.mostrar();
    }

    @GetMapping("/mostrarProductos")
    public int mostrar(){
        return servicio.cantidad();
    }

    @GetMapping("/totalProductos")
    public ArrayList<Productos> mostrar2(){
        return servicio.total();
    }

}
