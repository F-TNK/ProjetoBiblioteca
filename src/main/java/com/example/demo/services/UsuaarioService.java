package com.example.demo.services;

import com.example.demo.entities.Usuario;
import com.example.demo.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuaarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> findall(){ return repository.findAll();}
}
