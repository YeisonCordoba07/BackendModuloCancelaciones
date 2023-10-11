package com.udea.cancelaciones.DTO;


public class CancelarMateriaDTO {
    private String idMateria;
    private String idSolicitudCancelacion;
    private String documentoEstudiante;
    private String documentoProfesor;
    private String tipoSolicitud;
    private String estadoSolicitud;
    private String justificacionCancelacion;

    public CancelarMateriaDTO(String idMateria, String idSolicitudCancelacion, String documentoEstudiante, String documentoProfesor, String tipoSolicitud, String estadoSolicitud, String justificacionCancelacion) {
        this.idMateria = idMateria;
        this.idSolicitudCancelacion = idSolicitudCancelacion;
        this.documentoEstudiante = documentoEstudiante;
        this.documentoProfesor = documentoProfesor;
        this.tipoSolicitud = tipoSolicitud;
        this.estadoSolicitud = estadoSolicitud;
        this.justificacionCancelacion = justificacionCancelacion;
    }

    public String getIdSolicitudCancelacion() {
        return idSolicitudCancelacion;
    }

    public void setIdSolicitudCancelacion(String idSolicitudCancelacion) {
        this.idSolicitudCancelacion = idSolicitudCancelacion;
    }

    public String getDocumentoEstudiante() {
        return documentoEstudiante;
    }

    public void setDocumentoEstudiante(String documentoEstudiante) {
        this.documentoEstudiante = documentoEstudiante;
    }

    public String getDocumentoProfesor() {
        return documentoProfesor;
    }

    public void setDocumentoProfesor(String documentoProfesor) {
        this.documentoProfesor = documentoProfesor;
    }

    public String getTipoSolicitud() {
        return tipoSolicitud;
    }

    public void setTipoSolicitud(String tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }

    public String getEstadoSolicitud() {
        return estadoSolicitud;
    }

    public void setEstadoSolicitud(String estadoSolicitud) {
        this.estadoSolicitud = estadoSolicitud;
    }

    public String getJustificacionCancelacion() {
        return justificacionCancelacion;
    }

    public void setJustificacionCancelacion(String justificacionCancelacion) {
        this.justificacionCancelacion = justificacionCancelacion;
    }

    public String getIdMateria() {
        return idMateria;
    }
    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

}
