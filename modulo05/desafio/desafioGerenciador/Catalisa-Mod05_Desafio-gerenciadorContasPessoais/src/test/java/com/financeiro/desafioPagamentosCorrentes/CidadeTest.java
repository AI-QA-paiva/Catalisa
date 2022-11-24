package com.financeiro.desafioPagamentosCorrentes;

import com.financeiro.desafioPagamentosCorrentes.model.CidadeModel;
import com.financeiro.desafioPagamentosCorrentes.service.CidadeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Optional;

//@SpringBootTest
public class CidadeTest {

    //testando via Mokito

    @Test
    void exibirCidadesTest(){
        CidadeService mockCidadeService = Mockito.mock(CidadeService.class);
        List<CidadeModel> listaraTodasAsCidades = mockCidadeService.buscarTodasAsCidades();
        Assertions.assertTrue(listaraTodasAsCidades.isEmpty());

    }

    @Test
    void exibirEspecificaCidadeTest(){
        CidadeService mockCidadeService = Mockito.mock(CidadeService.class);
        CidadeModel cidadeModel = new CidadeModel();
        Long codigo= 0L;
        Optional<CidadeModel> listaraUmaCidade = mockCidadeService.buscarCidadeEspecifica(codigo);//optional
        Assertions.assertTrue(listaraUmaCidade.isEmpty());

    }



}
