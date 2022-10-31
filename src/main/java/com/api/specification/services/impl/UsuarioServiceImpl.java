package com.api.specification.services.impl;

import com.api.specification.models.UsuarioModel;
import com.api.specification.repositories.UsuarioRepository;
import com.api.specification.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository repository;



    @Override
    public UsuarioModel salvar(UsuarioModel usuario) {
        usuario.setStatus("Ativo");
        return repository.save(usuario);
    }

    @Override
    public List<UsuarioModel> buscarTodos() {
        return repository.findAll();
    }
}
