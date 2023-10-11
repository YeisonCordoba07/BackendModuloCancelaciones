package com.udea.cancelaciones;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Clase prueba
//
@RestController
@RequestMapping("/saludo")
public class HolaMundo {
    @GetMapping("/holaMundo")
    public String saludar(){
        return("Hola mundo");
    }
    
    @GetMapping("/login")
    public String getMessage(){
        return("Hola login");
    }
}
