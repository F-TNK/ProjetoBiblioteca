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

    //Get-Set Id --------------------------------------------------------
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

    //Get-Set endereco
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //Get-Set telefone
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //Get-Set telefone
    public String getListaLivros() {
        return listaLivros;
    }
    public void setListaLivros(String listaLivros) {
        this.listaLivros = listaLivros;
    }

    //Get-Set telefone
    public String getListaUsuarios() {
        return listaUsuarios;
    }
    public void setListaUsuarios(String listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    //Get-Set telefone
    public String getFuncionarios() {
        return funcionarios;
    }
    public void setFuncionarios(String funcionarios) {
        this.funcionarios = funcionarios;
    }
}
