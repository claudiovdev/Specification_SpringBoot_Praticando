package com.api.specification.services;

import com.api.specification.models.UsuarioModel;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioService {

    UsuarioModel salvar(UsuarioModel usuario);
}
