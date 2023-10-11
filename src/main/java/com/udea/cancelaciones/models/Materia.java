package com.udea.cancelaciones.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "materia")
@Data
public class Materia {

    @Id
    @Column(name = "id_materia")
    private String idMateria;

    @NotNull
    @Column(name = "nombre")
    private String nombre;

    @NotNull
    @Column(name = "creditos")
    private String creditos;

    @NotNull
    @Column(name = "habilitable")
    private String habilitable;

    @JsonIgnore
    @OneToMany(mappedBy = "materia", fetch = FetchType.LAZY)
    private Set<EstudianteMateria> estudianteMateriaSet;

    /*
    @OneToMany(mappedBy = "materia", fetch = FetchType.LAZY)
    private Set<ProfesorMateria> profesorMateriaSet;*/

    public Materia() {
    }
}
