package com.programacionweb.backend1.controllers;

import com.programacionweb.backend1.models.ExpedienteDocumento;
import com.programacionweb.backend1.services.ExpedienteDocumentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expedientes-documentos")
@RequiredArgsConstructor
public class ExpedienteDocumentoController {

    private final ExpedienteDocumentoService expedienteDocumentoService;

    @PostMapping
    public ResponseEntity<ExpedienteDocumento> crear(@RequestBody ExpedienteDocumento documento) {
        return ResponseEntity.ok(expedienteDocumentoService.guardar(documento));
    }

    @GetMapping
    public ResponseEntity<List<ExpedienteDocumento>> obtenerTodos() {
        return ResponseEntity.ok(expedienteDocumentoService.obtenerTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExpedienteDocumento> obtenerPorId(@PathVariable Long id) {
        return expedienteDocumentoService.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}