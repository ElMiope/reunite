package com.example.reunite.models;

import com.example.reunite.enums.Estado;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
public class SolicitudAmistad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long solicitud_id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario_emisor;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario_receptor;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    private LocalDateTime fecha_creacion;
    private LocalDateTime fecha_respuesta;
}
