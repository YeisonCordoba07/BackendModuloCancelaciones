package com.udea.cancelaciones.repository;

import com.udea.cancelaciones.models.EstudianteMateria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EstudianteMateriaRepository extends JpaRepository<EstudianteMateria, Integer> {


    List<EstudianteMateria> findEstudianteMateriaByDocumentoEstudiante(String documento);
    List<EstudianteMateria> findAllByDocumentoEstudiante(String documento);

    //@Query("SELECT * FROM EstudianteMateria em WHERE em.documentoEstudiante = :documentoEstudiante")
    //List<EstudianteMateria> findEstudianteMateriaByDocumentoEstudiante

}
