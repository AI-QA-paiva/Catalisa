package com.tabelasRelacionadas.enderecosCidadesEstados.controller;

import com.tabelasRelacionadas.enderecosCidadesEstados.model.PessoasModel;
import com.tabelasRelacionadas.enderecosCidadesEstados.service.PessoasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PessoasController {
    @Autowired
    private PessoasService pessoasService;

    @PostMapping(path="/pessoa")
    public PessoasModel cadastrarUmaPessoa(@RequestBody PessoasModel pessoasModel){
        return pessoasService.cadastrarPessoa(pessoasModel);
    }

    @GetMapping(path="/pessoa")
    public List<PessoasModel> buscarTodasAsPessoas(){
        return pessoasService.buscarPessoasTodas();
    }

    @GetMapping(path="/pessoa/{idPessoa}")
    public Optional<PessoasModel> buscarUmaPessoaId(@PathVariable Long idPessoa){
        return pessoasService.buscarPessoaEspecifica(idPessoa);
    }

    @PutMapping(path="/pessoa/{idPessoa}")
    public PessoasModel alterarPessoaId(@RequestBody PessoasModel pessoasModel){
        return pessoasService.alterarPessoa(pessoasModel);
    }

    @DeleteMapping(path="/pessoa/{idPessoa}")
    public void deletarUmaPessoa(@PathVariable Long idPess){
        pessoasService.deletarPessoa(idPess);
    }


}
