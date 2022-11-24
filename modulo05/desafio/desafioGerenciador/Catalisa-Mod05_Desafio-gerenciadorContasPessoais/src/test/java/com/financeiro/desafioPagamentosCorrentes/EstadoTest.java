package com.financeiro.desafioPagamentosCorrentes;


import com.financeiro.desafioPagamentosCorrentes.model.EstadoModel;
import com.financeiro.desafioPagamentosCorrentes.service.EstadoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Optional;

public class EstadoTest {

    @Test
    void exibirEstadosTest(){
        EstadoService mockEstadoService = Mockito.mock(EstadoService.class);
        List<EstadoModel> listaraTodosOsEstados = mockEstadoService.buscarTodosOsEstados();
        Assertions.assertTrue(listaraTodosOsEstados.isEmpty());
    }

    @Test
    void exibirUmEstadoQualquerTest(){
        EstadoService mockEstadoService = Mockito.mock(EstadoService.class);
        Long codigo = Long.valueOf(0);
        Optional<EstadoModel> listaraUmSoEstado = mockEstadoService.buscarEstadoEspecifico(codigo);
        Assertions.assertTrue(((Optional<?>) listaraUmSoEstado).isEmpty());
    }


}
