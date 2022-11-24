package com.bibliotecaPessoal.projetoOrganizarLivros.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "livros")


public class BibliotecaModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long codigoLivro;

    @Column(length = 100, nullable = false, unique = true)
    private String tituloLivro, autor,isbn;
    @Column(length = 30, nullable = false, unique = true)
    private String volume, generoLivro, editora, anoEdicao;


}
