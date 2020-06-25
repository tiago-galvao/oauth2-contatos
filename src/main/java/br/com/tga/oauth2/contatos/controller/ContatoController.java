package br.com.tga.oauth2.contatos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.tga.oauth2.contatos.model.Contato;
import br.com.tga.oauth2.contatos.security.Usuario;
import br.com.tga.oauth2.contatos.service.ContatoService;

@RestController
public class ContatoController {

    @Autowired
    ContatoService contatoService;

    @PostMapping
    public Contato create(@RequestBody Contato contato, @AuthenticationPrincipal Usuario usuario){
        contato.setIdUsuario(usuario.getId());
        return contatoService.create(contato);
    }

    @GetMapping
    public List<Contato> find(@AuthenticationPrincipal Usuario usuario){
        return contatoService.findAllContacts(usuario);
    }
}