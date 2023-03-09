package com.example.demo.Controladores;

import com.example.demo.Entidades.Productos;
import com.example.demo.Servicios.ServicioProductos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ControladorProductos {

    ServicioProductos servicio = new ServicioProductos();

    @GetMapping("/lista_productos")
    public ArrayList<Productos> listar(){
        return servicio.mostrar();
    }

    @GetMapping("/procutos_stock")
    public int productosStock(){
        return servicio.cantidadProductos();
    }

    @GetMapping("/total_productos")
    public String totalProductos(){
        return "Valor de la compra: "+servicio.totalProductos();
    }
}
