package com.programacionweb.backend1.controllers;

import com.programacionweb.backend1.models.AsesorAcademico;
import com.programacionweb.backend1.services.AsesorAcademicoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asesores-academicos")
@RequiredArgsConstructor
public class AsesorAcademicoController {

    private final AsesorAcademicoService asesorAcademicoService;

    @PostMapping
    public ResponseEntity<AsesorAcademico> crear(@RequestBody AsesorAcademico asesor) {
        return ResponseEntity.ok(asesorAcademicoService.guardar(asesor));
    }

    @GetMapping
    public ResponseEntity<List<AsesorAcademico>> obtenerTodos() {
        return ResponseEntity.ok(asesorAcademicoService.obtenerTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AsesorAcademico> obtenerPorId(@PathVariable Long id) {
        return asesorAcademicoService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}