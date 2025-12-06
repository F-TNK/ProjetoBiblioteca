package com.example.demo.services;

import com.example.demo.entities.Editora;
import com.example.demo.repositories.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditoraService {

    @Autowired
    private EditoraRepository repository;

    public List<Editora> findall(){ return repository.findAll();}

}
