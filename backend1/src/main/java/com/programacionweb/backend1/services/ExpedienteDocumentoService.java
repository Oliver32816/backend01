package com.programacionweb.backend1.services;

import com.programacionweb.backend1.models.ExpedienteDocumento;
import com.programacionweb.backend1.repositories.ExpedienteDocumentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExpedienteDocumentoService {

    private final ExpedienteDocumentoRepository expedienteDocumentoRepository;

    public ExpedienteDocumento guardar(ExpedienteDocumento documento) {
        return expedienteDocumentoRepository.save(documento);
    }

    public List<ExpedienteDocumento> obtenerTodos() {
        return expedienteDocumentoRepository.findAll();
    }

    public Optional<ExpedienteDocumento> obtenerPorId(Long id) {
        return expedienteDocumentoRepository.findById(id);
    }
}