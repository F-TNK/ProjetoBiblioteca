package com.example.demo.services;

import com.example.demo.entities.Livro;
import com.example.demo.repositories.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private LivroRepository repository;

    public List<Livro> findall(){ return repository.findAll();}
}
