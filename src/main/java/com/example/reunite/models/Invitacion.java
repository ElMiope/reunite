package com.example.reunite.models;

import com.example.reunite.enums.Estado;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
public class Invitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long invitacion_id;
    @ManyToOne
    private Usuario usuario_emisor;
    @ManyToOne
    private Usuario usuario_receptor;
    @Enumerated(EnumType.STRING)
    private Estado estado;

    private LocalDateTime fecha_creacion;
    private LocalDateTime fecha_respuesta;

}
