package com.example.demo.services;

import com.example.demo.entities.Livro;
import com.example.demo.entities.Multa;
import com.example.demo.repositories.MultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MultaService {

    @Autowired
    private MultaRepository repository;

    public List<Multa> findAll(){ return repository.findAll();}

    public Multa findById(Long id) {
        Optional<Multa> obj = repository.findById(id);
        return obj.get();
    }

    public Multa insert(Multa obj){
        return repository.save(obj);
    }

    public void delete(Long id) { repository.deleteById(id);}

    public Multa update(Long id, Multa obj) {
        Multa entity = repository.getOne(id);
        updateData(entity, obj);
        return  repository.save(entity);
    }
    private void updateData(Multa entity, Multa obj){
        entity.setDataGeracao(obj.getDataGeracao());
        entity.setPago(obj.getPago());
        entity.setMotivo(obj.getMotivo());
        entity.setValor(obj.getValor());
    }
}
