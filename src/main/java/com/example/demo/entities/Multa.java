package com.example.demo.entities;

import jakarta.persistence.*;
// Import de varias ferramentas ao usar @Entity

import java.time.Instant;
@Entity

public class Multa {

    @Id
    @Column(length = 11)                                // Define o tamanho do ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o ID
    private Long id;
    private Double valor;
    private Instant dataGeracao;
    private String motivo;
    private String pago;


    // Construtor sem argumentos
    public Multa() {}

    // Construtor com argumentos
    public Multa(Long id, Double valor, Instant dataGeracao, String motivo, String pago)
    {
        this.id = id;
        this.valor = valor;
        this.dataGeracao = dataGeracao;
        this.motivo = motivo;
        this.pago = pago;
    }
}
