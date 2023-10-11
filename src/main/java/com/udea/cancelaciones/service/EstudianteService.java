package com.udea.cancelaciones.service;

import com.udea.cancelaciones.models.Estudiante;
import com.udea.cancelaciones.models.EstudianteMateria;
import com.udea.cancelaciones.repository.EstudianteRepository;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EstudianteService {

    //El DAO es el repository

    private EstudianteRepository estudianteRepository;

    public EstudianteService(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    public List<Estudiante> findAll(){
        var listaEstudiantes = estudianteRepository.findAll();
        return listaEstudiantes;
    }

    public Estudiante findEstudianteByDocumentoEstudiante(String documento){
        var estudiante = estudianteRepository.findEstudianteByDocumentoEstudiante(documento);
        return estudiante;
    }

    public Estudiante findEstudianteByUsuarioInstitucional(String usuario){
        var estudiante = estudianteRepository.findEstudianteByUsuarioInstitucional(usuario);
        return estudiante;
    }
}
