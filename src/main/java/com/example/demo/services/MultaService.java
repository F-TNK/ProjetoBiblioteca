package com.example.demo.services;

import com.example.demo.entities.Multa;
import com.example.demo.repositories.MultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MultaService {

    @Autowired
    private MultaRepository repository;

    public List<Multa> findall(){ return repository.findAll();}
}
