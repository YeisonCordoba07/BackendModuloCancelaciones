package com.udea.cancelaciones.DTO;

public class DatosFormLoginDTO {
    private String usuario;
    private String contraseña;

    public DatosFormLoginDTO(){}

    public DatosFormLoginDTO(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
