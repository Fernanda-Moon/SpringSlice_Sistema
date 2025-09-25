package com.sistema_restaurante.Pizzaria_SliceSpring.repositories;

import com.sistema_restaurante.Pizzaria_SliceSpring.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
