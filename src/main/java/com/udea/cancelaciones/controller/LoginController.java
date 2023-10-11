package com.udea.cancelaciones.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.udea.cancelaciones.DTO.DatosFormLoginDTO;
import com.udea.cancelaciones.DTO.LoginMensajeDTO;
import com.udea.cancelaciones.service.LoginService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/login")
public class LoginController {
    
    @Autowired
    private LoginService loginService;

    @PostMapping
    public ResponseEntity<LoginMensajeDTO> autenticacionlogin(@RequestBody DatosFormLoginDTO loginDTO){
        var mensaje = loginService.AutenticarLogin(loginDTO);
        return ResponseEntity.ok(mensaje);
    }
}
