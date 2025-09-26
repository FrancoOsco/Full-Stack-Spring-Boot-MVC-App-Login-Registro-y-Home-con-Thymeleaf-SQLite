package com.curso.marcos_de_desarroll_web.springboot.web.springboot_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import com.curso.marcos_de_desarroll_web.springboot.web.springboot_web.model.Usuario;
import com.curso.marcos_de_desarroll_web.springboot.web.springboot_web.service.UsuarioService;
import org.springframework.security.core.Authentication;

@Controller
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/registro")
    public String mostrarRegistro(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "registro";
    }

    @PostMapping("/registro")
    public String registrarUsuario(Usuario usuario) {
        usuarioService.registrar(usuario);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String mostrarLogin() {
        return "login";
    }

    @GetMapping("/home")
    public String home(Model model, Authentication authentication) {
        String username = authentication.getName();
        Usuario usuario = usuarioService.buscarPorUsername(username);
        model.addAttribute("nombreUsuario", usuario.getNombre());
        return "home";
    }
}
