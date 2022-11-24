package com.testandoDesenvolvimento.testemvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// essa anotação nao faz relacional com banco de dados, não tem o @RestController
// o objetivo da anotação é a de criar um Map do model object e encontrar uma view,
public class HomeController {

    @RequestMapping("/")
    // essa anotação usada a nivel de classe e metodo.
    // essa anotação utilizada tradicionalmente em nivel dde classe, implementa URL handler,
    // quando usada a nivel de metodo, passa a url que o metodo será executado
    // para mapear solicitações web para classes/metodos manipuladoras
    // ela suporta os métodos Post, Get, Put, Delete e Pacth.
    public @ResponseBody String greeting(){
        //anotação indica ao Spring que o recurso não manda/não recebe
        //por meio de uma página da Web.
        return "Hello, World";
    }

}
