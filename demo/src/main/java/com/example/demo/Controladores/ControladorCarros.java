package com.example.demo.Controladores;

import com.example.demo.Entidades.Carro;
import com.example.demo.Servicios.ServicioCarros;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ControladorCarros {

    ServicioCarros servicio = new ServicioCarros();

    @GetMapping("/lista_carros")
    public ArrayList<Carro> listar(){
        return servicio.listar_carros();
    }

    @PostMapping("/agregar_carros")
    public String agregar_carros(@RequestBody Carro carro) {

        return servicio.AgregarCarros(carro);
    }
}
