package com.seguranca.produtosSeguranca.controller;

import com.seguranca.produtosSeguranca.model.UsuariosModel;
import com.seguranca.produtosSeguranca.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;

    @GetMapping(value = "/usuarios")
    public ResponseEntity<List<UsuariosModel>> buscarUsuariosCadastrados(){
        return ResponseEntity.ok(usuariosService.buscarUsuarios());
    }

    @PostMapping(value = "/usuarios/create")
    public ResponseEntity<UsuariosModel> cadastrarUmUsuario(@RequestBody UsuariosModel usuariosModel){
        UsuariosModel novoUsuario = usuariosService.cadastrarUsuario(usuariosModel);
        return new ResponseEntity<>(novoUsuario, HttpStatus.CREATED);
    }



}
