package com.example.demo.Controladores;

import com.example.demo.Entidades.Carro;
import com.example.demo.Entidades.Personas;
import com.example.demo.Servicios.ServicioPersonas;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ControladorPersonas {

    ServicioPersonas servicio = new ServicioPersonas();

     @GetMapping("/ListaPersonas")
    public ArrayList<Personas> listar() {
         return servicio.ListaPersonas();
     }

    @PostMapping("/AgregarPersonas")
    public String AgregarPerosna(@RequestBody Personas persona) {

        return servicio.AgregarPersonas(persona);
    }

    @GetMapping("/BuscarPersona1/{edad}")
    public Personas BuscarPersona1(@PathVariable("edad")int edad){
         return servicio.BuscarPersona1(edad);
    }

    @GetMapping("/BuscarPersona2/{nom}")
    public Personas BuscarPersona2(@PathVariable("nom")String nombre){
        return servicio.BuscarPersona2(nombre);
    }

}
