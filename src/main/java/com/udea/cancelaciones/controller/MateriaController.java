package com.udea.cancelaciones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udea.cancelaciones.models.Materia;
import com.udea.cancelaciones.service.MateriaService;

@RestController
@RequestMapping("/materia")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MateriaController {
    
    @Autowired
    private MateriaService materiaService;

    @GetMapping("/find-all")
    public ResponseEntity<List<Materia>> findAll(){
        var materias = materiaService.findAll();
        return ResponseEntity.ok(materias);
    }
}
