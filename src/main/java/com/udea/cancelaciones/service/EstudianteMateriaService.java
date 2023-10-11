package com.udea.cancelaciones.service;

import com.udea.cancelaciones.models.Estudiante;
import com.udea.cancelaciones.models.EstudianteMateria;
import com.udea.cancelaciones.repository.EstudianteMateriaRepository;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EstudianteMateriaService {

    private EstudianteMateriaRepository estudianteMateriaRepository;

    public EstudianteMateriaService(EstudianteMateriaRepository estudianteMateriaRepository){
        this.estudianteMateriaRepository = estudianteMateriaRepository;
    }


    public List<EstudianteMateria> findAll(){
        var listaEstudiantes = estudianteMateriaRepository.findAll();
        return listaEstudiantes;
    }

    public List<EstudianteMateria> findEstudianteMateriasPorDocumentoEstudiante(String documento){
        var materiasEstudiante = estudianteMateriaRepository.findEstudianteMateriaByDocumentoEstudiante(documento);
        return materiasEstudiante;
    }

    public List<EstudianteMateria> findAllByDocumentoEstudiante(String documento){
        var materiasEstudiante = estudianteMateriaRepository.findAllByDocumentoEstudiante(documento);
        return materiasEstudiante;
    }
}
