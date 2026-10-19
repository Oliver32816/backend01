package com.programacionweb.backend1.controllers;

import com.programacionweb.backend1.models.ProyectoResidencia;
import com.programacionweb.backend1.services.ProyectoResidenciaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proyectos-residencia")
@RequiredArgsConstructor
public class ProyectoResidenciaController {

    private final ProyectoResidenciaService proyectoResidenciaService;

    @PostMapping
    public ResponseEntity<ProyectoResidencia> crear(@RequestBody ProyectoResidencia proyecto) {
        return ResponseEntity.ok(proyectoResidenciaService.guardar(proyecto));
    }

    @GetMapping
    public ResponseEntity<List<ProyectoResidencia>> obtenerTodos() {
        return ResponseEntity.ok(proyectoResidenciaService.obtenerTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProyectoResidencia> obtenerPorId(@PathVariable Long id) {
        return proyectoResidenciaService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}