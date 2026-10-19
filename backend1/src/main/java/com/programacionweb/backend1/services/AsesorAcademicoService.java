package com.programacionweb.backend1.services;

import com.programacionweb.backend1.models.AsesorAcademico;
import com.programacionweb.backend1.repositories.AsesorAcademicoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AsesorAcademicoService {

    private final AsesorAcademicoRepository asesorAcademicoRepository;

    public AsesorAcademico guardar(AsesorAcademico asesor) {
        return asesorAcademicoRepository.save(asesor);
    }

    public List<AsesorAcademico> obtenerTodos() {
        return asesorAcademicoRepository.findAll();
    }

    public Optional<AsesorAcademico> obtenerPorId(Long id) {
        return asesorAcademicoRepository.findById(id);
    }
}