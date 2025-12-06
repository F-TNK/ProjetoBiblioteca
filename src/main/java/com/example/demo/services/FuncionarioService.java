package com.example.demo.services;

import com.example.demo.entities.Funcionario;
import com.example.demo.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    public List<Funcionario> findall(){ return repository.findAll();}

    public Funcionario findById(Long id) {
        Optional<Funcionario> obj = repository.findById(id);
        return obj.get();
    }

    public Funcionario insert(Funcionario obj){
        return repository.save(obj);
    }
}
