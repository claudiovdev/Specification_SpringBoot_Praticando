package com.api.specification.services;

import com.api.specification.models.UsuarioModel;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UsuarioService {

    UsuarioModel salvar(UsuarioModel usuario);

    List<UsuarioModel> buscarTodos();

    List<UsuarioModel> buscaMaiorDeIdade(String nome);
}
