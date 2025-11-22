package com.example.demo.entities;

import java.time.Instant;

public class Autor {

    private Long id;
    // Tem private, protected, public ...
    // Private - não permite acesso por outras classes (sem nenhuma ação adicional)
    // Long - Como INT permite só numeros inteiros, mas permite números com mais algarismos

    private String nome;
    private String nacionalidade;
    private Instant dataNascimento;
    private String biografia;

}
