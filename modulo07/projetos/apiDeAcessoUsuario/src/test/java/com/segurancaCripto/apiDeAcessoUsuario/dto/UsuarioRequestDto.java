package com.segurancaCripto.apiDeAcessoUsuario.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@AllArgsConstructor
@Data
@NoArgsConstructor

public class UsuarioRequestDto {

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false,length = 2)
    private Integer idade;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String senha;

}
