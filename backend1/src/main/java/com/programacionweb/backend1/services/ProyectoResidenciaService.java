package com.programacionweb.backend1.services;

import com.programacionweb.backend1.models.ProyectoResidencia;
import com.programacionweb.backend1.repositories.ProyectoResidenciaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProyectoResidenciaService {

    private final ProyectoResidenciaRepository proyectoResidenciaRepository;

    public ProyectoResidencia guardar(ProyectoResidencia proyecto) {
        return proyectoResidenciaRepository.save(proyecto);
    }

    public List<ProyectoResidencia> obtenerTodos() {
        return proyectoResidenciaRepository.findAll();
    }

    public Optional<ProyectoResidencia> obtenerPorId(Long id) {
        return proyectoResidenciaRepository.findById(id);
    }
}