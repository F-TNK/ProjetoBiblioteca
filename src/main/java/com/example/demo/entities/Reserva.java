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

    //Get-Set Id --------------------------------------------------------
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Instant getDataReserva() {
        return dataReserva;
    }
    public void setDataReserva(Instant dataReserva) {
        this.dataReserva = dataReserva;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getLivro() {
        return livro;
    }
    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    // ----------------------------------------------------------------
}
