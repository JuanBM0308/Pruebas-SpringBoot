package com.example.demo.Controladores;

import com.example.demo.Entidades.Personas;
import com.example.demo.Servicios.ServicioPersonas;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ControladorPersonas {

    ServicioPersonas servicio = new ServicioPersonas();

     @GetMapping("/ListaPersonas")
    public ArrayList<Personas> listar() {
         return servicio.ListaPersonas();
     }


}
