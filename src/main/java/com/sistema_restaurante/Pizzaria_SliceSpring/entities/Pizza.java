package com.sistema_restaurante.Pizzaria_SliceSpring.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="pizzas")
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Double preco;
    private String tamanho;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Pizza() {}

    public Pizza(String nome, Double preco, String tamanho, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.tamanho = tamanho;
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}

