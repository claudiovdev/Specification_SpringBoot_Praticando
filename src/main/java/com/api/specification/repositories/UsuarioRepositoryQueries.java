package com.api.specification.repositories;

import com.api.specification.models.UsuarioModel;

import java.util.List;

public interface UsuarioRepositoryQueries {

    List<UsuarioModel> buscarMaiorDeIdade(String nome);
}
