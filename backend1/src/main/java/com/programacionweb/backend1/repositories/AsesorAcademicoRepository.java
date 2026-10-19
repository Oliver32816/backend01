package com.programacionweb.backend1.repositories;

import com.programacionweb.backend1.models.AsesorAcademico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsesorAcademicoRepository extends JpaRepository<AsesorAcademico, Long> {
}