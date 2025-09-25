package com.sistema_restaurante.Pizzaria_SliceSpring.repositories;

import com.sistema_restaurante.Pizzaria_SliceSpring.entities.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MesaRepository extends JpaRepository<Mesa, Long> {
}
