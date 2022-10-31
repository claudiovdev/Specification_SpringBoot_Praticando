package com.api.specification.repositories.Impl;

import com.api.specification.models.UsuarioModel;
import com.api.specification.repositories.UsuarioRepository;
import com.api.specification.repositories.UsuarioRepositoryQueries;
import com.api.specification.spec.UsuarioSpecs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import static com.api.specification.spec.UsuarioSpecs.maiorDeIdade;
import static com.api.specification.spec.UsuarioSpecs.comNomeSemelhante;


import java.util.List;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepositoryQueries {

    @Autowired @Lazy
    UsuarioRepository repository;

    @Override
    public List<UsuarioModel> buscarMaiorDeIdade(String nome) {
        return repository.findAll(maiorDeIdade().and(comNomeSemelhante(nome)));
    }
}
