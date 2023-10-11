package com.udea.cancelaciones.models;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "profesor_materia")
@Data
public class ProfesorMateria {

    @Id
    @Column(name = "id_materia")
    @NotNull
    private String idMateria;

    @Column(name = "documento_profesor")
    @NotNull
    private String documentoProfesor;

    @Column(name = "semestre_matricula")
    @NotNull
    private String semestreMatricula;


    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "documento_profesor", insertable=false, updatable=false)
    private Profesor profesor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_materia", insertable=false, updatable=false)
    private Materia materia;*/

    public ProfesorMateria() {

    }
}
