/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.examen1_ItzelMendezMartinez.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.uv.examen1_ItzelMendezMartinez.modelos.Alumnos;
import org.uv.examen1_ItzelMendezMartinez.repository.AlumnosRepository;
import org.uv.examen1_ItzelMendezMartinez.repository.GruposRepository;

@RestController
@RequestMapping("/alumnos")
public class AlumnosController {
    
    @Autowired
    private AlumnosRepository alumnosRepository;

    @Autowired
    private GruposRepository gruposRepository;

    @GetMapping
    public ResponseEntity<Page<Alumnos>> listarAlumnos(Pageable pageable) {
        return ResponseEntity.ok(alumnosRepository.findAll(pageable));
    }
    
}
