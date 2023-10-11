package com.udea.cancelaciones.controller;

import com.udea.cancelaciones.models.Estudiante;
import com.udea.cancelaciones.models.EstudianteMateria;
import com.udea.cancelaciones.service.EstudianteMateriaService;
import com.udea.cancelaciones.service.EstudianteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/estudiante-materia")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EstudianteMateriaController {

    //ENLACES
    //http://localhost:8080/api/estudiante-materia/find-all
    //http://localhost:8080/api/estudiante-materia/get-materia-estudiante/992023

    
    private EstudianteMateriaService estudianteMateriaService;

    public EstudianteMateriaController(EstudianteMateriaService estudianteMateriaService) {
        this.estudianteMateriaService = estudianteMateriaService;
    }

    @GetMapping("/find-all")
    public ResponseEntity<List<EstudianteMateria>> findAll(){
        var listaEstudiantes = estudianteMateriaService.findAll();
        return ResponseEntity.ok(listaEstudiantes);
    }

    @GetMapping("/get-materia-estudiante/{documento}")
    public ResponseEntity<List<EstudianteMateria>> getMateriasPorDocumentoEstudiante(@PathVariable String documento){
        var materiasEstudiante = estudianteMateriaService.findEstudianteMateriasPorDocumentoEstudiante(documento);
        return ResponseEntity.ok(materiasEstudiante);
    }
    @GetMapping("/find-materia-estudiante/{documento}")
    public ResponseEntity<List<EstudianteMateria>> findMateriasPorDocumentoEstudiante(@PathVariable String documento){
        var materiasEstudiante = estudianteMateriaService.findAllByDocumentoEstudiante(documento);
        return ResponseEntity.ok(materiasEstudiante);
    }
}
