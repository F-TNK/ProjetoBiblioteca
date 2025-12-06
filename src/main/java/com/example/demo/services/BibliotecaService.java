package com.example.demo.services;

import com.example.demo.entities.Biblioteca;
import com.example.demo.repositories.BibliotecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliotecaService {

    @Autowired
    private BibliotecaRepository repository;

    public List<Biblioteca> findall(){ return repository.findAll();}

}
