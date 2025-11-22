package com.example.demo.entities;

import java.time.Instant;
import jakarta.persistence.*;
// Import de varias ferramentas ao usar @Entity

@Entity
public class Autor {

    @Id
    @Column(length = 11)                                // Define o tamanho do ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o ID
    private Long id;
    // Tem private, protected, public ...
    // Private - não permite acesso por outras classes (sem nenhuma ação adicional)
    // Long - Como INT permite só numeros inteiros, mas permite números com mais algarismos

    private String nome;
    private String nacionalidade;
    private Instant dataNascimento;
    private String biografia;

    // Construtor sem argumentos
    public Autor() {}

    // Construtor com argumentos
    public Autor(Long id, String nome, String nacionalidade, Instant dataNascimento, String biografia)
    {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
        this.biografia = biografia;
    }


    // Get & Set (recuperar e alterar entidades) de cada um
    //Get-Set Id ---------------------------------------------------
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    //Get-Set nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Get-Set Nacionalidade
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    //Get-Set dataNascimento
    public Instant getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Instant dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    //Get-Set biografia
    public String getBiografia() {
        return biografia;
    }
    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
    // -------------------------------------------------------------------
}