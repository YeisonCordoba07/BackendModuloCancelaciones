package com.udea.cancelaciones.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udea.cancelaciones.DTO.DatosFormLoginDTO;
import com.udea.cancelaciones.DTO.LoginMensajeDTO;
import com.udea.cancelaciones.repository.EstudianteRepository;
import javax.transaction.Transactional;

@Service
@Transactional
public class LoginService {
    
    @Autowired
    private EstudianteRepository estudianteRepository;

    public LoginMensajeDTO AutenticarLogin(DatosFormLoginDTO loginDTO){
        var estudiante = estudianteRepository.findEstudianteByUsuarioInstitucional(loginDTO.getUsuario());

        if (estudiante != null){
            if (estudiante.getContraseña().equals(loginDTO.getContraseña())){
                return new LoginMensajeDTO("El login fue exitoso", true);
            } else {
                return new LoginMensajeDTO("Contraseña incorrecta", false);
            }
        } else {
            return new LoginMensajeDTO("El usuario no existe", false);
        }
    }
}
