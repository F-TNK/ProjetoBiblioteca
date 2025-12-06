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

    public List<Reserva> findAll(){ return repository.findAll();}

    public Reserva findById(Long id) {
        Optional<Reserva> obj = repository.findById(id);
        return obj.get();
    }

    public Reserva insert(Reserva obj){
        return repository.save(obj);
    }

    public void delete(Long id) { repository.deleteById(id);}

    public Reserva update(Long id, Reserva obj) {
        Reserva entity = repository.getOne(id);
        updateData(entity, obj);
        return  repository.save(entity);
    }
    private void updateData(Reserva entity, Reserva obj) {
        entity.setLivro(obj.getLivro());
        entity.setDataReserva(obj.getDataReserva());
        entity.setStatus(obj.getStatus());
        entity.setUsuario(obj.getUsuario());
    }
}
