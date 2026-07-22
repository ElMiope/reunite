package com.example.reunite.models;

import com.example.reunite.enums.TipoNotificacion;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
public class Notificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notificacion_id;
    @ManyToOne
    @JoinColumn(name="usuario_id")
    private Usuario usuario_receptor;
    private String mensaje;
    @Enumerated(EnumType.STRING)
    private TipoNotificacion tipoNotificacion;
    private LocalDateTime fecha_creacion;
}
