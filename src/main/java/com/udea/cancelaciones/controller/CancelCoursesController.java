package com.udea.cancelaciones.controller;

import com.udea.cancelaciones.models.SolicitudCancelacion;
import com.udea.cancelaciones.service.EstudianteService;
import com.udea.cancelaciones.service.SolicitudCancelacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udea.cancelaciones.DTO.CancelarMateriaDTO;
import com.udea.cancelaciones.DTO.DatosFormCancelarMatDTO;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/cancel-courses-api")
public class CancelCoursesController {


    public static int idSolicitud = 7;

    @Autowired
    private SolicitudCancelacionService solicitudCancelacionService;

    @Autowired
    private EstudianteService estudianteService; 

    @GetMapping
    public String getMessage(){
        return "Controlador de cancelación de cursos";
    }

    @PostMapping 
    public void cancelarCurso(@RequestBody DatosFormCancelarMatDTO datosFormCancelarMatDTO){
        System.out.println(datosFormCancelarMatDTO.getIdMateria()+" | | "+datosFormCancelarMatDTO.getMotivo());
        
        idSolicitud++;

        var estudiante = estudianteService.findEstudianteByUsuarioInstitucional(datosFormCancelarMatDTO.getUser());

        SolicitudCancelacion cancelacion = new SolicitudCancelacion();
        cancelacion.setIdSolicitudCancelacion("SC00"+idSolicitud);
        cancelacion.setDocumentoEstudiante(estudiante.getDocumentoEstudiante());
        cancelacion.setIdMateria(datosFormCancelarMatDTO.getIdMateria());
        cancelacion.setDocumentoProfesor("1111111111");
        cancelacion.setTipoSolicitud("Cancelación");
        cancelacion.setEstadoSolicitud("Pendiente");
        cancelacion.setJustificacionCancelacion(datosFormCancelarMatDTO.getMotivo());

        solicitudCancelacionService.guardarSolicitudCancelacion(cancelacion);
    }
}

