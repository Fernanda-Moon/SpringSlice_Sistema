package com.sistema_restaurante.Pizzaria_SliceSpring.services;

import com.sistema_restaurante.Pizzaria_SliceSpring.entities.Mesa;
import com.sistema_restaurante.Pizzaria_SliceSpring.repositories.MesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MesaService {

    @Autowired
    private MesaRepository mesaRepository;

    public List<Mesa> findAll() {
        return mesaRepository.findAll();
    }

    public Mesa save(Mesa mesa) {
        return mesaRepository.save(mesa);
    }

    public void deleteById(Long id) {
        mesaRepository.deleteById(id);
    }
}
