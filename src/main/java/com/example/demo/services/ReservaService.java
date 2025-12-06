package com.example.demo.services;

import com.example.demo.entities.Reserva;
import com.example.demo.repositories.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository repository;

    public List<Reserva> findall(){ return repository.findAll();}

    public Reserva findById(Long id) {
        Optional<Reserva> obj = repository.findById(id);
        return obj.get();
    }

    public Reserva insert(Reserva obj){
        return repository.save(obj);
    }
}
