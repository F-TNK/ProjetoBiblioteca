package com.example.demo.services;

import com.example.demo.repositories.MultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MultaService {

    @Autowired
    private MultaRepository repository;
}
