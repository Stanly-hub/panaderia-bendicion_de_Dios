package com.panaderiaBDD.gestion_panaderia.model;

import com.panaderiaBDD.gestion_panaderia.model.Panadero;
import com.panaderiaBDD.gestion_panaderia.model.enums.Turno;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "panadero_id")
    private Panadero panadero;

    private LocalDate fecha;

    @Enumerated(EnumType.STRING)
    private Turno turno;

    private Integer cantidadTotal;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetallePedido> detalles;
}