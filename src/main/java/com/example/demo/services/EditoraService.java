package com.example.demo.services;

import com.example.demo.entities.Editora;
import com.example.demo.repositories.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EditoraService {

    @Autowired
    private EditoraRepository repository;

    public List<Editora> findall(){ return repository.findAll();}

    public Editora findById(Long id) {
        Optional<Editora> obj = repository.findById(id);
        return obj.get();
    }

    public Editora insert(Editora obj){
        return repository.save(obj);
    }
}
