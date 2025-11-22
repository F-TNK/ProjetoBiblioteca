package com.example.demo.entities;

import java.time.Instant;

public class Livro {

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

}
