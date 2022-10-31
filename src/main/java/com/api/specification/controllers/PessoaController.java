package com.api.specification.controllers;

import com.api.specification.models.UsuarioModel;
import com.api.specification.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/maior-de-idade-com-nome")
    public List<UsuarioModel> listarMaioresDeIdade(String nome){
        return service.buscaMaiorDeIdade(nome);
    }
    @PostMapping
    public ResponseEntity<UsuarioModel> salvarUsuario(@RequestBody UsuarioModel usuario){
        service.salvar(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
