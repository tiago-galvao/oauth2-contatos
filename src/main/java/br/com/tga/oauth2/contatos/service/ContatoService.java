package br.com.tga.oauth2.contatos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tga.oauth2.contatos.model.Contato;
import br.com.tga.oauth2.contatos.security.Usuario;
import br.com.tga.oauth2.contatos.repository.ContatoRepository;

@Service
public class ContatoService {
    @Autowired
    private ContatoRepository contatoRepository;

    public Contato create(Contato contato) {
        Contato contatoObjeto = contatoRepository.save(contato);
        return contatoObjeto;
    }

    public List<Contato> findAllContacts(Usuario usuario) {
        List<Contato> contatos = contatoRepository.findByIdUsuario(usuario.getId());
        return contatos;
    }
}