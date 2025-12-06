package com.example.demo.services;

import com.example.demo.entities.Livro;
import com.example.demo.repositories.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    private LivroRepository repository;

    public List<Livro> findall(){ return repository.findAll();}

    public Livro findById(Long id) {
        Optional<Livro> obj = repository.findById(id);
        return obj.get();
    }

    public Livro insert(Livro obj){
        return repository.save(obj);
    }
}
