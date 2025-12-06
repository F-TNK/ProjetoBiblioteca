package com.example.demo.services;

import com.example.demo.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuaarioService {

    @Autowired
    private UsuarioRepository repository;
}
