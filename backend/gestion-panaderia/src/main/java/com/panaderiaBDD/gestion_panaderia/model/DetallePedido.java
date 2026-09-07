package com.panaderiaBDD.gestion_panaderia.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DetallePedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "tipo_pan_id")
    private TipoPan tipoPan;

    private Integer cantidad;
}