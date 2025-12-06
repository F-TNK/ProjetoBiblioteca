package com.example.demo.services;

import com.example.demo.entities.Funcionario;
import com.example.demo.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    public List<Funcionario> findall(){ return repository.findAll();}

}
