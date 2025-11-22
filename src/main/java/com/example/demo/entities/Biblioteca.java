package com.example.demo.entities;

import jakarta.persistence.*;

import java.time.Instant;
// Import de varias ferramentas ao usar @Entity

@Entity

public class Biblioteca {

    @Id
    @Column(length = 11)                                // Define o tamanho do ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o ID
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private String listaLivros;
    private String listaUsuarios;
    private String funcionarios;


    // Construtor sem argumentos
    public Biblioteca() {}

    // Construtor com argumentos
    public Biblioteca(Long id, String nome, String endereco, String telefone,
                      String listaLivros, String listaUsuarios, String funcionarios)
    {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.listaLivros = listaLivros;
        this.listaUsuarios = listaUsuarios;
        this.funcionarios = funcionarios;
    }
}
