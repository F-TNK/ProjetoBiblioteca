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

    //Get-Set Id --------------------------------------------------------
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Long getQuantidadeExemplares() {
        return quantidadeExemplares;
    }
    public void setQuantidadeExemplares(Long quantidadeExemplares) {
        this.quantidadeExemplares = quantidadeExemplares;
    }

    public Long getExemplaresDisponiveis() {
        return exemplaresDisponiveis;
    }
    public void setExemplaresDisponiveis(Long exemplaresDisponiveis) {
        this.exemplaresDisponiveis = exemplaresDisponiveis;
    }

    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Instant getDataPublicacao() {
        return dataPublicacao;
    }
    public void setDataPublicacao(Instant dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
    // ----------------------------------------------------------------
}
