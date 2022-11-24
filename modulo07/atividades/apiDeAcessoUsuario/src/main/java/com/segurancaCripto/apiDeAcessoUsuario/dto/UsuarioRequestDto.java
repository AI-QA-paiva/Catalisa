package com.segurancaCripto.apiDeAcessoUsuario.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Validated
public class UsuarioRequestDto {

    @NotEmpty(message = "O campo nao pode ser vazio")
    private String nome;


    private Integer idade;

    @NotEmpty(message = "O campo nao pode ser vazio")
    private String telefone;

    @NotEmpty(message = "O campo nao pode ser vazio")
    private String login;

    @NotEmpty(message = "O campo nao pode ser vazio")
    private String senha;


}
