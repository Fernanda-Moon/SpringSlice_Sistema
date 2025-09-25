package com.sistema_restaurante.Pizzaria_SliceSpring.controllers;

import com.sistema_restaurante.Pizzaria_SliceSpring.entities.Mesa;
import com.sistema_restaurante.Pizzaria_SliceSpring.services.MesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/mesas")
public class MesaController {

    @Autowired
    private MesaService mesaService;

    @GetMapping
    public List<Mesa> getAllMesas() {
        return mesaService.findAll();
    }

    @PostMapping
    public Mesa createMesa(@RequestBody Mesa mesa) {
        return mesaService.save(mesa);
    }

    @DeleteMapping("/{id}")
    public void deleteMesa(@PathVariable Long id) {
        mesaService.deleteById(id);
    }
}
