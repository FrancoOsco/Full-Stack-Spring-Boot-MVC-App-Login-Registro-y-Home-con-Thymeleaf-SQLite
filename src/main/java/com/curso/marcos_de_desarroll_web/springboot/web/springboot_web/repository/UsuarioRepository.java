package com.curso.marcos_de_desarroll_web.springboot.web.springboot_web.repository;

import com.curso.marcos_de_desarroll_web.springboot.web.springboot_web.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByUsername(String username);
}
