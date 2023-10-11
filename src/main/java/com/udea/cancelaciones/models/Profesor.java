package com.udea.cancelaciones.models;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "profesor")
@Data
public class Profesor {


    @Id
    @NotNull
    @Column(name = "documento_profesor")
    private String documentoProfesor;


    @NotNull
    @Column(name = "tipo_documento_profesor")
    private String tipoDocumentoProfesor;

    @NotNull
    @Column(name = "nombre")
    private String nombre;

    @NotNull
    @Column(name = "apellido")
    private String apellido;

    @NotNull
    @Column(name = "direccion")
    private String direccion;

    @NotNull
    @Column(name = "telefono")
    private String telefono;

    @NotNull
    @Column(name = "usuario_institucional")
    private String usuarioInstitucional;

    @NotNull
    @Column(name = "contraseña")
    private String contraseña;


    /*@OneToMany(mappedBy = "profesor", fetch = FetchType.LAZY)
    private Set<ProfesorMateria> profesorMateriaSet;*/


    public Profesor() {

    }
}
