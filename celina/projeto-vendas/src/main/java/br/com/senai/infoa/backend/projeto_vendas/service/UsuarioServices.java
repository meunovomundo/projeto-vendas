package br.com.senai.infoa.backend.projeto_vendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.infoa.backend.projeto_vendas.models.Usuario;
import br.com.senai.infoa.backend.projeto_vendas.repositories.UsuarioRepository;

@Service 
public class UsuarioServices {
    @Autowired 
    private UsuarioRepository usuarioRepository;

    public Usuario cadastrar(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
