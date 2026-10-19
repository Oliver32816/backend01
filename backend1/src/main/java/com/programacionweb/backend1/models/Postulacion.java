package com.programacionweb.backend1.models;

import com.programacionweb.backend1.models.enums.Estado_Postulacion;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.FetchType;
import jakarta.persistence.Column;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Postulaciones")
public class Postulacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPostulacion;

    // Establecer la relación de muchos a 1 con la tabla alumnos
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "numero_control",
            nullable = false
    )
    private Alumno alumno;

    // Establecer la relación de muchos a 1 con la tabla proyecto_residencia
    /*
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "id_proyecto",
            nullable = false
    )
    private ProyectoResidencia proyectoResidencia;
    */

    private LocalDate fechaSolicitud = LocalDate.now();

    @Enumerated(EnumType.STRING)
    private Estado_Postulacion estado = Estado_Postulacion.EN_REVISION;

    @Column(columnDefinition = "TEXT")
    private String comentariosEmpresa;

}