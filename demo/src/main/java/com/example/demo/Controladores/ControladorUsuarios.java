package com.example.demo.Controladores;

import com.example.demo.Entidades.Usuario;
import com.example.demo.Servicios.ServicioUsuarios;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ControladorUsuarios {
    ServicioUsuarios servicio = new ServicioUsuarios();

    @GetMapping("/ListarUsuarios")
    public ArrayList<Usuario> listar(){
        return servicio.listar();
    }

    @PostMapping("/ ")
    public String agregar(@RequestBody Usuario usuario) {
        return servicio.AgregarUsuario(usuario);
    }
}
