package com.panaderiaBDD.gestion_panaderia.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "panadero")
@Data //ya que data incluye un costructor donde pide todos los atributos
@NoArgsConstructor
public class Panadero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column (nullable = false)
    private String nombre;
}
