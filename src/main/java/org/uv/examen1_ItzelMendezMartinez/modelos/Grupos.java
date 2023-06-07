/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.examen1_ItzelMendezMartinez.modelos;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "grupos")
public class Grupos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="clavegrupo")
    private int claveGrupo;
    
    @Column(name="nombreGrupo")
    private String nombreGrupo;
    
    @Column(name="claveAlumno")
    private String claveAlumno;
    
    @OneToMany(mappedBy = "grupos", cascade = CascadeType.ALL)
    private Set<Alumnos> alumno = new HashSet<>();
    

    public Grupos() {
    }

    public Grupos(GruposDTO grupos) {
        this.claveGrupo = grupos.getClavegrupoDTO();
        this.nombreGrupo = grupos.getNombregrupoDTO();
        this.claveAlumno = grupos.getNombrealumnoDTO();
    }
    
    

    public int getClaveGrupo() {
        return claveGrupo;
    }

    public void setClaveGrupo(int claveGrupo) {
        this.claveGrupo = claveGrupo;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public String getClaveAlumno() {
        return claveAlumno;
    }

    public void setClaveAlumno(String claveAlumno) {
        this.claveAlumno = claveAlumno;
    }
    
    
    
}
