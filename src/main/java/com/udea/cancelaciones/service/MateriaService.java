package com.udea.cancelaciones.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udea.cancelaciones.models.EstudianteMateria;
import com.udea.cancelaciones.models.Materia;
import com.udea.cancelaciones.repository.MateriaRepository;

@Service
@Transactional
public class MateriaService {
    
    @Autowired
    private MateriaRepository materiaRepository;

    public List<Materia> findAll(){
        var materias = materiaRepository.findAll();
        return materias;
    }
}
