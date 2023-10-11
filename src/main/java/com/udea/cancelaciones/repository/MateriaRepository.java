package com.udea.cancelaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.udea.cancelaciones.models.Materia;

public interface MateriaRepository extends JpaRepository<Materia, Integer>{
    public Materia findMateriaByIdMateria(String id);
}
