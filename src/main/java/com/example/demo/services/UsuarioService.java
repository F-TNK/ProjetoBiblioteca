package com.example.demo.services;

import com.example.demo.entities.Usuario;
import com.example.demo.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> findall(){ return repository.findAll();}

    public Usuario findById(Long id) {
        Optional<Usuario> obj = repository.findById(id);
        return obj.get();
    }

    public Usuario insert(Usuario obj){
        return repository.save(obj);
    }

    public void delete(Long id) { repository.deleteById(id);}

    public Usuario update(Long id, Usuario obj) {
        Usuario entity = repository.getOne(id);
        updateData(entity, obj);
        return  repository.save(entity);
    }
    private void updateData(Usuario entity, Usuario obj) {
        entity.setCpf(obj.getCpf());
        entity.setDataCadastro(obj.getDataCadastro());
        entity.setEmail(obj.getEmail());
        entity.setNome(obj.getNome());
        entity.setEmprestimosAtivos(obj.getEmprestimosAtivos());
        entity.setTelefone(obj.getTelefone());
        entity.setEndereco(obj.getEndereco());
    }
}
