package com.udea.cancelaciones.controller;

import com.udea.cancelaciones.models.SolicitudCancelacion;
import com.udea.cancelaciones.service.SolicitudCancelacionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/solicitud-cancelacion")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SolicitudCancelacionController {




    private SolicitudCancelacionService solicitudCancelacionService;

    public SolicitudCancelacionController(SolicitudCancelacionService solicitudCancelacionService){
        this.solicitudCancelacionService = solicitudCancelacionService;
    }




    @GetMapping("/find-all")
    public ResponseEntity<List<SolicitudCancelacion>> findAll(){
        var solicitudes = solicitudCancelacionService.findAll();
        return ResponseEntity.ok(solicitudes);
    }

    @GetMapping("/find-solicitud-por-documento/{documento}")
    public ResponseEntity<List<SolicitudCancelacion>> findAllByDocumentoEstudiante(@PathVariable String documento){
        var solicitud = solicitudCancelacionService.findAllByDocumentoEstudiante(documento);
        return ResponseEntity.ok(solicitud);
    }

    @GetMapping("/find-solicitud-por-id/{id}")
    public ResponseEntity<SolicitudCancelacion> findByIdSolicitudCancelacion(@PathVariable String id){
        var solicitud = solicitudCancelacionService.findByIdSolicitudCancelacion(id);
        return ResponseEntity.ok(solicitud);
    }
}
