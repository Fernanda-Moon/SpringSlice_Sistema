package com.sistema_restaurante.Pizzaria_SliceSpring.controllers;

import com.sistema_restaurante.Pizzaria_SliceSpring.entities.Pizza;
import com.sistema_restaurante.Pizzaria_SliceSpring.services.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pizzas")
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @GetMapping
    public List<Pizza> getAllPizzas() {
        return pizzaService.findAll();
    }

    @PostMapping
    public Pizza createPizza(@RequestBody Pizza pizza) {
        return pizzaService.save(pizza);
    }

    @DeleteMapping("/{id}")
    public void deletePizza(@PathVariable Long id) {
        pizzaService.deleteById(id);
    }
}
