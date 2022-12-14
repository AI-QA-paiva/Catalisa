package com.example.CURSO.model.enumeric;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@Entity
@Getter
@NoArgsConstructor
@Setter
@Table(name = "topico")

public class TopicoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 100, nullable = false)
    private String titulo;

    @Column(length = 500, nullable = false)
    private String mensagem;

    @Column(length = 10)
    private LocalDate dataCriacao=LocalDate.now();

}





