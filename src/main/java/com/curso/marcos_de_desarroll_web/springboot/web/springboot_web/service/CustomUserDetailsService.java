package com.curso.marcos_de_desarroll_web.springboot.web.springboot_web.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UsuarioService usuarioService;

    public CustomUserDetailsService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.curso.marcos_de_desarroll_web.springboot.web.springboot_web.model.Usuario usuario =
                usuarioService.buscarPorUsername(username);

        return User.builder()
                .username(usuario.getUsername())
                .password("{noop}" + usuario.getPassword())
                .roles("USER")
                .build();
    }
}
