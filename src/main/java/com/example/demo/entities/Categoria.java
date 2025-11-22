package com.example.demo.entities;

import jakarta.persistence.*;

import java.time.Instant;
// Import de varias ferramentas ao usar @Entity

@Entity

public class Categoria {

    @Id
    @Column(length = 11)                                // Define o tamanho do ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o ID
    private Long id;
    private String nome;
    private String descricao;
    private String pago;


    // Construtor sem argumentos
    public Categoria() {}

    // Construtor com argumentos
    public Categoria(Long id, String nome, String descricao, String pago)
    {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.pago = pago;
    }
}
