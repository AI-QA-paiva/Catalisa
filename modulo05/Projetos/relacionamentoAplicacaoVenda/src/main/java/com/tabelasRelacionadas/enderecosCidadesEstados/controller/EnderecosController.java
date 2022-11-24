package com.tabelasRelacionadas.enderecosCidadesEstados.controller;

import com.tabelasRelacionadas.enderecosCidadesEstados.model.EnderecosModel;
import com.tabelasRelacionadas.enderecosCidadesEstados.service.EnderecosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EnderecosController {
    @Autowired
    private EnderecosService enderecosService;

    @PostMapping(path="/endereco")
    public EnderecosModel cadastrarOEndereco(@RequestBody EnderecosModel enderecosModel){
        return enderecosService.cadastrarEndereco(enderecosModel);
    }

    @GetMapping(path="/endereco")
    public List<EnderecosModel> buscarOsEnderecos(){
        return enderecosService.buscarEnderecosTodos();
    }

    @GetMapping(path="/endereco/{idEndereco}")
    public Optional<EnderecosModel> buscarUmEndereco(@PathVariable Long idEnder){
        return enderecosService.buscarEnderecoEspecifico(idEnder);
    }

    @PutMapping(path="/endereco/{idEndereco}")
    public EnderecosModel alterarUmEndereco(@RequestBody EnderecosModel endereco){
        return enderecosService.alterarEndereco(endereco);
    }

    @DeleteMapping(path="/endereco/{idEndereco}")
    public void deletarUmEndereco(@PathVariable Long idEndereco){
        enderecosService.deletarEndereco(idEndereco);
    }


}
