package com.example.reunite.models;

import com.example.reunite.enums.Unidad;
import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.Pair;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long item_id;
    private String nombre;
    private Pair<Double, Unidad> cantidad;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
