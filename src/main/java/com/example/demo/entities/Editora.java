package com.example.demo.entities;

import jakarta.persistence.*;

import java.time.Instant;
// Import de varias ferramentas ao usar @Entity

@Entity

public class Editora {

    @Id
    @Column(length = 11)                                // Define o tamanho do ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o ID
    private Long id;
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;


    // Construtor sem argumentos
    public Editora() {}

    // Construtor com argumentos
    public Editora(Long id, String nome, String cnpj, String endereco, String telefone)
    {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
    }
}
