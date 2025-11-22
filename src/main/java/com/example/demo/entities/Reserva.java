package com.example.demo.entities;

import jakarta.persistence.*;
// Import de varias ferramentas ao usar @Entity

import java.time.Instant;
@Entity

public class Reserva {

    @Id
    @Column(length = 11)                                // Define o tamanho do ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o ID
    private Long id;
    private Instant dataReserva;
    private String status;
    private String livro;
    private String usuario;


    // Construtor sem argumentos
    public Reserva() {}

    // Construtor com argumentos
    public Reserva(Long id, Instant dataReserva, String status, String livro, String usuario)
    {
        this.id = id;
        this.dataReserva = dataReserva;
        this.status = status;
        this.livro = livro;
        this.usuario = usuario;
    }
}
