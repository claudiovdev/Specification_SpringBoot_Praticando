package com.api.specification.controllers;

import com.api.specification.models.UsuarioModel;
import com.api.specification.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/usuarios")
@RestController
public class PessoaController {

    @Autowired
    UsuarioService service;

    @GetMapping
    public List<UsuarioModel> listarUsuarios(){
        return service.buscarTodos();
    }
}
