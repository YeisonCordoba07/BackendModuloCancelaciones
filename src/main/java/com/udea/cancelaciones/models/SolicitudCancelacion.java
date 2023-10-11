package com.udea.cancelaciones.models;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "solicitud_cancelacion")
@Data
public class SolicitudCancelacion {

    @Id
    @Column(name = "id_solicitud_cancelacion")
    @NotNull
    private String idSolicitudCancelacion;

    @Column(name = "documento_estudiante")
    @NotNull
    private String documentoEstudiante;

    @Column(name = "id_materia")
    @NotNull
    private String idMateria;

    @Column(name = "documento_profesor")
    @NotNull
    private String documentoProfesor;

    @Column(name = "tipo_solicitud")
    @NotNull
    private String tipoSolicitud;

    @Column(name = "estado_solicitud")
    @NotNull
    private String estadoSolicitud;

    @Column(name = "justificacion_cancelacion")
    @NotNull
    private String justificacionCancelacion;


    //RELACIONES

    @ManyToOne
    @JoinColumn(name = "documento_estudiante", updatable = false, insertable = false)
    private Estudiante estudiante;



    @OneToOne(mappedBy = "solicitudCancelacion")
    private EstudianteMateria estudianteMateria;


    public SolicitudCancelacion() {

    }
}
