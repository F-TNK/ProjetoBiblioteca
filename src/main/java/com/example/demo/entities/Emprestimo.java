package com.example.demo.entities;

import jakarta.persistence.*;
// Import de varias ferramentas ao usar @Entity

import java.time.Instant;
@Entity

public class Emprestimo {

    @Id
    @Column(length = 11)                                // Define o tamanho do ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o ID
    private Long id;
    private Instant dataEmprestimo;
    private Instant dataDevolucaoPrevista;
    private Instant dataDevolucaoReal;
    private String status;
    private String livro;
    private String usuario;


    // Construtor sem argumentos
    public Emprestimo() {}

    // Construtor com argumentos
    public Emprestimo(Long id, Instant dataEmprestimo, Instant dataDevolucaoPrevista,
                      Instant dataDevolucaoReal, String status, String livro, String usuario)
    {
        this.id = id;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.dataDevolucaoReal = dataDevolucaoReal;
        this.status = status;
        this.livro = livro;
        this.usuario = usuario;
    }
}
