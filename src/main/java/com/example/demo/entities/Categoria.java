package com.example.demo.entities;

import jakarta.persistence.*;

import java.time.Instant;
// Import de varias ferramentas ao usar @Entity

@Entity

public class Categoria {

    @Id
    @Column(length = 11)                                // Define o tamanho do ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o ID
    private Long id;
    private String nome;
    private String descricao;
    private String pago;


    // Construtor sem argumentos
    public Categoria() {}

    // Construtor com argumentos
    public Categoria(Long id, String nome, String descricao, String pago)
    {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.pago = pago;
    }

    //Get-Set Id --------------------------------------------------------
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPago() {
        return pago;
    }
    public void setPago(String pago) {
        this.pago = pago;
    }
    // ------------------------------------------------------------------
}
