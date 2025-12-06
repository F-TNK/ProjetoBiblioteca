package com.example.demo.services;

import com.example.demo.entities.Emprestimo;
import com.example.demo.repositories.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmprestimoService {

    @Autowired
    private EmprestimoRepository repository;

    public List<Emprestimo> findall(){ return repository.findAll();}

    public Emprestimo findById(Long id) {
        Optional<Emprestimo> obj = repository.findById(id);
        return obj.get();
    }

    public Emprestimo insert(Emprestimo obj){
        return repository.save(obj);
    }
}
