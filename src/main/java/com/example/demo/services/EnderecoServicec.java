package com.example.demo.services;

import com.example.demo.entities.Endereco;
import com.example.demo.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoServicec {

    @Autowired
    private EnderecoRepository repository;

    public List<Endereco> findall(){ return repository.findAll();}

}
