package com.example.demo.entities;

import jakarta.persistence.*;
// Import de varias ferramentas ao usar @Entity

import java.time.Instant;
@Entity

public class Livro {

    @Id
    @Column(length = 11)                                // Define o tamanho do ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o ID
    private Long id;
    private String titulo;
    private String autor;
    private String editora;
    private String isbn;
    private String genero;
    private Long quantidadeExemplares;
    private Long exemplaresDisponiveis;
    private Double preco;
    // Double - Para numeros com casa decimal
    private Instant dataPublicacao;


    // Construtor sem argumentos
    public Livro() {}

    // Construtor com argumentos
    public Livro(Long id, String titulo, String autor, String editora, String isbn, String genero,
                 Long quantidadeExemplares, Long exemplaresDisponiveis, Double preco, Instant dataPublicacao)
    {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.genero = genero;
        this.quantidadeExemplares = quantidadeExemplares;
        this.exemplaresDisponiveis = exemplaresDisponiveis;
        this.preco = preco;
        this.dataPublicacao = dataPublicacao;
    }
}
