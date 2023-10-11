package com.udea.cancelaciones.controller;

import com.udea.cancelaciones.DTO.EstudianteDTO;
import com.udea.cancelaciones.models.Estudiante;
import com.udea.cancelaciones.service.EstudianteMateriaService;
import com.udea.cancelaciones.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/estudiante")
public class EstudianteController {




    @Autowired
    private EstudianteService estudianteService;
    private EstudianteMateriaService estudianteMateriaService;


    public EstudianteController(EstudianteService estudianteService, EstudianteMateriaService estudianteMateriaService) {
        this.estudianteService = estudianteService;
        this.estudianteMateriaService = estudianteMateriaService;
    }




    @GetMapping("/find-all")
    public ResponseEntity<List<Estudiante>> findAll(){
        var listaEstudiantes = estudianteService.findAll();
        return ResponseEntity.ok(listaEstudiantes);
    }

    @GetMapping("/find-one")
    public ResponseEntity<Estudiante> findOne(){
        var listaEstudiantes = estudianteService.findAll();
        return ResponseEntity.ok(listaEstudiantes.get(0));
    }


    @GetMapping("/find-estudiante-by-documento/{documento}")
    public ResponseEntity<Estudiante> findEstudianteByDocumentoEstudiante(@PathVariable String documento){
        var estudiante = estudianteService.findEstudianteByDocumentoEstudiante(documento);
        return ResponseEntity.ok(estudiante);
    }


    @GetMapping("/find-estudiante-by-usuario/{usuario}")
    public ResponseEntity<Estudiante> findEstudianteByUsuarioInstitucional(@PathVariable String usuario){
        var estudiante = estudianteService.findEstudianteByUsuarioInstitucional(usuario);
        return ResponseEntity.ok(estudiante);
    }


    @GetMapping("/find-estudiante-by-usuarios/{usuario}")
    public ResponseEntity<EstudianteDTO> findByUsuarioInstitucional(@PathVariable String usuario){

        var estudiante = estudianteService.findEstudianteByUsuarioInstitucional(usuario);
        var materias = estudianteMateriaService.findAllByDocumentoEstudiante(estudiante.getDocumentoEstudiante());

        EstudianteDTO estudianteDTO = new EstudianteDTO();

        estudianteDTO.setNombre(estudiante.getNombre());
        estudianteDTO.setApellido(estudiante.getApellido());

        estudianteDTO.setListaMaterias(materias);

        return ResponseEntity.ok(estudianteDTO);
    }
}
