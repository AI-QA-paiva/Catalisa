package com.seguranca.produtosSeguranca.service;

import com.seguranca.produtosSeguranca.model.UsuariosModel;
import com.seguranca.produtosSeguranca.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    public List<UsuariosModel> buscarUsuarios() {
        return usuariosRepository.findAll();
    }

    public UsuariosModel cadastrarUsuario(UsuariosModel usuariosModel) {
        return usuariosRepository.save(usuariosModel);
    }


}
