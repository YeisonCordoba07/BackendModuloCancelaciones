package com.udea.cancelaciones.models;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "estudiante_materia")
@Data
public class EstudianteMateria {

    @Id
    @NotNull
    @Column(name = "id_materia")
    private String idMateria;


    @NotNull
    @Column(name = "documento_estudiante")
    private String documentoEstudiante;

    @NotNull
    @Column(name = "semestre_matricula")
    private String semestreMatricula;

    @NotNull
    @Column(name = "estado")
    private String estado;


    //RELACIONES
    @ManyToOne
    @JoinColumn(name ="documento_estudiante", updatable = false, insertable = false)
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "id_materia", updatable = false, insertable = false)
    private Materia materia;

    @OneToOne
    @JoinColumn(name = "id_solicitud_cancelacion")
    private SolicitudCancelacion solicitudCancelacion;


    public EstudianteMateria() {

    }
}
