package com.programacionweb.backend1.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "asesores_academicos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AsesorAcademico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asesor")
    private Long idAsesor;

    @OneToOne
    @JoinColumn(name = "id_usuario", nullable = false, unique = true)
    private Usuario usuario;

    @Column(name = "nombre_completo", nullable = false)
    private String nombreCompleto;

    private String departamento;

    @Column(name = "maximo_alumnos")
    private Integer maximoAlumnos;
}