/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.examen1_ItzelMendezMartinez.modelos;

/**
 *
 * @author yahir
 */
public class AlumnosDTO {
    
    private int claveDTO;
    private String nombreDTO;
    private String direccionDTO;
    private String telefonoDTO;
    private Grupos gruposDTO;

    public int getClaveDTO() {
        return claveDTO;
    }

    public void setClaveDTO(int claveDTO) {
        this.claveDTO = claveDTO;
    }

    public String getNombreDTO() {
        return nombreDTO;
    }

    public void setNombreDTO(String nombreDTO) {
        this.nombreDTO = nombreDTO;
    }

    public String getDireccionDTO() {
        return direccionDTO;
    }

    public void setDireccionDTO(String direccionDTO) {
        this.direccionDTO = direccionDTO;
    }

    public String getTelefonoDTO() {
        return telefonoDTO;
    }

    public void setTelefonoDTO(String telefonoDTO) {
        this.telefonoDTO = telefonoDTO;
    }
    

    public Grupos getGruposDTO() {
        return gruposDTO;
    }

    public void setGruposDTO(Grupos gruposDTO) {
        this.gruposDTO = gruposDTO;
    }

    
}
