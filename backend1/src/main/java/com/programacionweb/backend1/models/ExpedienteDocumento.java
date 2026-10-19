package com.programacionweb.backend1.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "expedientes_documentos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExpedienteDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_documento")
    private Long idDocumento;

    @ManyToOne
    @JoinColumn(name = "id_postulacion", nullable = false)
    private Postulacion postulacion;

    @Column(name = "tipo_documento", nullable = false)
    private String tipoDocumento;

    @Column(name = "ruta_archivo_url", nullable = false)
    private String rutaArchivoUrl;

    @Column(name = "fecha_subida")
    private LocalDate fechaSubida;

    @Column(name = "estado_aprobacion")
    private Boolean estadoAprobacion;
}