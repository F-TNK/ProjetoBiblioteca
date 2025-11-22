package com.example.demo.entities;

import jakarta.persistence.*;

import java.time.Instant;
// Import de varias ferramentas ao usar @Entity

@Entity

public class Endereco {

    @Id
    @Column(length = 11)                                // Define o tamanho do ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o ID
    private Long id;
    private String rua;
    private Long numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;


    // Construtor sem argumentos
    public Endereco() {}

    // Construtor com argumentos
    public Endereco(Long id, String rua, Long numero, String bairro,
                    String cidade, String estado, String cep)
    {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
}
