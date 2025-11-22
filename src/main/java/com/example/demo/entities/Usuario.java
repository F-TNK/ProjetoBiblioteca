package com.example.demo.entities;

import jakarta.persistence.*;
// Import de varias ferramentas ao usar @Entity

import java.time.Instant;
@Entity

public class Usuario {

    @Id
    @Column(length = 11)                                // Define o tamanho do ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o ID
    private Long id;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
    private Instant dataCadastro;
    private String emprestimosAtivos;


    // Construtor sem argumentos
    public Usuario() {}

    // Construtor com argumentos
    public Usuario(Long id, String nome, String cpf, String endereco, String telefone,
                   String email, Instant dataCadastro, String emprestimosAtivos)
    {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.dataCadastro = dataCadastro;
        this.emprestimosAtivos = emprestimosAtivos;
    }
}
