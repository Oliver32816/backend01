package com.programacionweb.backend1.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "empresas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa")
    private Long idEmpresa;

    @OneToOne
    @JoinColumn(name = "id_usuario", nullable = false, unique = true)
    private Usuario usuario;

    @Column(name = "razon_social", nullable = false)
    private String razonSocial;

    private String sector;

    @Column(name = "nombre_contacto")
    private String nombreContacto;

    private String telefono;

    @Column(columnDefinition = "TEXT")
    private String direccion;

    @Column(name = "estado_verificacion")
    private Boolean estadoVerificacion;
}