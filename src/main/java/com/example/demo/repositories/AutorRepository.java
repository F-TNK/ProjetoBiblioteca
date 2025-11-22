package com.example.demo.repositories;

// Interface X Class
// interface: Informa a estrutura de ações e informações necessárias mas não FAZ nada

import com.example.demo.entities.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {



}
