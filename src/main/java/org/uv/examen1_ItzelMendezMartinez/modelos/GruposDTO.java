/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.examen1_ItzelMendezMartinez.modelos;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author yahir
 */
public class GruposDTO {
    
    private int clavegrupoDTO;
    private String nombregrupoDTO;
    private String nombrealumnoDTO;
    private Set<Alumnos> alumnosDTO = new HashSet<>();

    public int getClavegrupoDTO() {
        return clavegrupoDTO;
    }

    public void setClavegrupoDTO(int clavegrupoDTO) {
        this.clavegrupoDTO = clavegrupoDTO;
    }

    public String getNombregrupoDTO() {
        return nombregrupoDTO;
    }

    public void setNombregrupoDTO(String nombregrupoDTO) {
        this.nombregrupoDTO = nombregrupoDTO;
    }

    public String getNombrealumnoDTO() {
        return nombrealumnoDTO;
    }

    public void setNombrealumnoDTO(String nombrealumnoDTO) {
        this.nombrealumnoDTO = nombrealumnoDTO;
    }

    public Set<Alumnos> getAlumnosDTO() {
        return alumnosDTO;
    }

    public void setAlumnosDTO(Set<Alumnos> alumnosDTO) {
        this.alumnosDTO = alumnosDTO;
    }
    
    
}
