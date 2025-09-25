package com.sistema_restaurante.Pizzaria_SliceSpring.repositories;

import com.sistema_restaurante.Pizzaria_SliceSpring.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
