package com.panaderiaBDD.gestion_panaderia.repository;

import com.panaderiaBDD.gestion_panaderia.model.Panadero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PanaderoRepository extends JpaRepository<Panadero,Long> {
}
