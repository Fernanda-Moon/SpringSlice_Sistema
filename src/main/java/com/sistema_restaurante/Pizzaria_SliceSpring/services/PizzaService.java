package com.sistema_restaurante.Pizzaria_SliceSpring.services;

import com.sistema_restaurante.Pizzaria_SliceSpring.entities.Pizza;
import com.sistema_restaurante.Pizzaria_SliceSpring.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    public List<Pizza> findAll() {
        return pizzaRepository.findAll();
    }

    public Pizza save(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    public void deleteById(Long id) {
        pizzaRepository.deleteById(id);
    }
}
