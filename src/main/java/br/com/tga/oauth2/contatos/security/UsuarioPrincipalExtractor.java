package br.com.tga.oauth2.contatos.security;

import java.util.Map;

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;

public class UsuarioPrincipalExtractor implements PrincipalExtractor {

    @Override
    public Object extractPrincipal(Map<String, Object> map) {
        Usuario usuario = new Usuario();
        usuario.setId((Integer) map.get("id"));
        usuario.setNome((String) map.get("nome"));
        return usuario;
    }
}