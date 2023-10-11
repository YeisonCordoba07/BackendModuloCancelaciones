package com.udea.cancelaciones.DTO;

import com.udea.cancelaciones.models.EstudianteMateria;

import java.util.List;

public class EstudianteDTO {

    private String nombre;
    private String apellido;

    private List<EstudianteMateria> listaMaterias;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<EstudianteMateria> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(List<EstudianteMateria> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    public void agregarMateria(EstudianteMateria materia){
        listaMaterias.add(materia);
    }
}
