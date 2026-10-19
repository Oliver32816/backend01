package com.programacionweb.backend1.models;

import com.programacionweb.backend1.models.enums.EstadoResidencia;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Column;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Alumnos")
public class Alumno {

    @Id
    private String numeroControl;

    // Establecer la relación de 1 en 1 con la tabla usuarios
    @OneToOne
    @JoinColumn(
            name = "id_usuario",
            referencedColumnName = "idUsuario",
            nullable = false,
            unique = true
    )
    private Usuario usuario;

    @Column(nullable = false)
    private String nombreCompleto;

    @Column(nullable = false)
    private String carrera;

    @Column(nullable = false)
    private Integer semestre;

    @Column(nullable = false)
    private String habilidadesTecnicas;

    @Enumerated(EnumType.STRING)
    private EstadoResidencia estadoresidencia;

}