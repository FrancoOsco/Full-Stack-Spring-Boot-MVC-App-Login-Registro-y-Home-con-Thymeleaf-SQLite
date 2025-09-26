package com.curso.marcos_de_desarroll_web.springboot.web.springboot_web.service;

import org.springframework.stereotype.Service;
import com.curso.marcos_de_desarroll_web.springboot.web.springboot_web.model.Usuario;
import com.curso.marcos_de_desarroll_web.springboot.web.springboot_web.repository.UsuarioRepository;

import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario registrar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario buscarPorUsername(String username) {
        Optional<Usuario> optionalUsuario = usuarioRepository.findByUsername(username);
        return optionalUsuario.orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }
}
