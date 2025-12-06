package com.example.demo.services;

import com.example.demo.entities.Emprestimo;
import com.example.demo.entities.Endereco;
import com.example.demo.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository repository;

    public List<Endereco> findall(){ return repository.findAll();}

    public Endereco findById(Long id) {
        Optional<Endereco> obj = repository.findById(id);
        return obj.get();
    }

    public Endereco insert(Endereco obj){
        return repository.save(obj);
    }

    public void delete(Long id) { repository.deleteById(id);}


    public Endereco update(Long id, Endereco obj) {
        Endereco entity = repository.getOne(id);
        updateData(entity, obj);
        return  repository.save(entity);
    }
    private void updateData(Endereco entity, Endereco obj) {
        entity.setBairro(obj.getBairro());
        entity.setCep(obj.getCep());
        entity.setCidade(obj.getCidade());
        entity.setEstado(obj.getEstado());
        entity.setNumero(obj.getNumero());
        entity.setRua(obj.getRua());
    }

}
