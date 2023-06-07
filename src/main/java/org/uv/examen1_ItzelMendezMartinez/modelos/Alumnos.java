/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.examen1_ItzelMendezMartinez.modelos;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "alumnos")
public class Alumnos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="clave")
    private int clave;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="direccion")
    private String direccion;
    
    @Column(name="telefono")
    private String telefono;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "clavegrupo")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Grupos grupo;

    
    public Grupos getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupos grupo) {
        this.grupo = grupo;
    }


    public Alumnos(AlumnosDTO alumno) {
        this.clave = alumno.getClaveDTO();
        this.nombre = alumno.getNombreDTO();
        this.direccion = alumno.getDireccionDTO();
        this.telefono = alumno.getTelefonoDTO();
    }        

    public Alumnos() {
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
