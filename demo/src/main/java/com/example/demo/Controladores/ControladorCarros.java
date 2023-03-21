package com.example.demo.Controladores;

import com.example.demo.Entidades.Carro;
import com.example.demo.Entidades.Usuario;
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

    @GetMapping("/BuscarCarrosPlaca/{plac}")
    public Carro buscar_carros_placa(@PathVariable("plac") String placa) {
        return servicio.BuscarCarrosPlaca(placa);
    }

    @GetMapping("/BuscarCarrosMarca/{mar}")
    public Carro buscar_carros_marca(@PathVariable("mar") String marca) {
        return servicio.BuscarCarrosMarca(marca);
    }
}
