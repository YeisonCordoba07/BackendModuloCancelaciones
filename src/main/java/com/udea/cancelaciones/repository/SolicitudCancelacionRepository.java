package com.udea.cancelaciones.repository;


import com.udea.cancelaciones.models.SolicitudCancelacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SolicitudCancelacionRepository extends JpaRepository<SolicitudCancelacion, Integer> {

    SolicitudCancelacion findByIdSolicitudCancelacion(String id);

    List<SolicitudCancelacion> findAllByDocumentoEstudiante(String documento);
}
