package com.programacionweb.backend1.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "proyectos_residencia")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProyectoResidencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proyecto")
    private Long idProyecto;

    @ManyToOne
    @JoinColumn(name = "id_empresa", nullable = false)
    private Empresa empresa;

    @Column(nullable = false)
    private String titulo;

    @Column(columnDefinition = "TEXT")
    private String descripcion;

    @Column(columnDefinition = "TEXT")
    private String objetivo;

    @Column(name = "tecnologias_requeridas", columnDefinition = "TEXT")
    private String tecnologiasRequeridas;

    @Column(name = "cupo_alumnos", nullable = false)
    private Integer cupoAlumnos;

    private String estado;

    @Column(name = "fecha_publicacion")
    private LocalDate fechaPublicacion;
}