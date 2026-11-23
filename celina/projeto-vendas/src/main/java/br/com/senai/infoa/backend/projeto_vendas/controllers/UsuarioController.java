package br.com.senai.infoa.backend.projeto_vendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.infoa.backend.projeto_vendas.models.Usuario;
import br.com.senai.infoa.backend.projeto_vendas.service.UsuarioServices;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController 
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired 
    private UsuarioServices usuarioServices;

    @PostMapping("/cadastar")
    public Usuario cadastrar(@RequestBody Usuario usuario) {
        return usuarioServices.cadastrar(usuario);
    }

}
