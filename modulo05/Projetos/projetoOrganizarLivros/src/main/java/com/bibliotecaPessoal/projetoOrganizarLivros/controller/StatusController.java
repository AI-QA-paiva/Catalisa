package com.bibliotecaPessoal.projetoOrganizarLivros.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StatusController {

    @GetMapping(path = "/status")
    public String checar (){
        return "Tudo Certinho.\nVocê conectou ao banco de dados com Sucesso!!!";
}



}
