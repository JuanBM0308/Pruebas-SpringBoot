package com.example.demo.Controladores;

import com.example.demo.Entidades.Carro;
import com.example.demo.Servicios.ServicioCarros;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ControladorCarros {

    ServicioCarros servicio = new ServicioCarros();

    @GetMapping("/lista_carros")
    public ArrayList<Carro> listar(){
        return servicio.listar_carros();
    }
}
