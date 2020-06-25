package br.com.tga.oauth2.contatos.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.tga.oauth2.contatos.model.Contato;

public interface ContatoRepository extends CrudRepository<Contato, Long>{
    List<Contato> findByIdUsuario(Integer idUsuario);
}