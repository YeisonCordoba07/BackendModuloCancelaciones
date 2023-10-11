package com.udea.cancelaciones.DTO;

public class DatosFormCancelarMatDTO {
    private String idMateria;
    private String motivo;
    private String user;
    
    public DatosFormCancelarMatDTO(String idMateria, String motivo, String user) {
        this.idMateria = idMateria;
        this.motivo = motivo;
        this.user = user;
    }
    public String getIdMateria() {
        return idMateria;
    }
    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }

}
