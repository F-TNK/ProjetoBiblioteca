package com.example.demo.services;

import com.example.demo.entities.Autor;
import com.example.demo.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    private AutorRepository repository;

    public List<Autor> findall(){ return repository.findAll();}

    public Autor findById(Long id) {
        Optional<Autor> obj = repository.findById(id);
        return obj.get();
    }

    public Autor insert(Autor obj){
        return repository.save(obj);
    }

    public void delete(Long id) { repository.deleteById(id);}

    private void updateData(Autor entity, Autor obj) {
        entity.setBiografia(obj.getBiografia());
        entity.setDataNascimento(obj.getDataNascimento());
        entity.setNome(obj.getNome());
        entity.setNacionalidade(obj.getNacionalidade());
    }
}
