package com.example.demo.services;

import com.example.demo.entities.Emprestimo;
import com.example.demo.entities.Endereco;
import com.example.demo.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository repository;

    public List<Endereco> findall(){ return repository.findAll();}

    public Endereco findById(Long id) {
        Optional<Endereco> obj = repository.findById(id);
        return obj.get();
    }

    public Endereco insert(Endereco obj){
        return repository.save(obj);
    }
}
