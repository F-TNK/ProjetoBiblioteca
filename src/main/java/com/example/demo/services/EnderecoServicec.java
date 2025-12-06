package com.example.demo.services;

import com.example.demo.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoServicec {

    @Autowired
    private EnderecoRepository repository;
}
