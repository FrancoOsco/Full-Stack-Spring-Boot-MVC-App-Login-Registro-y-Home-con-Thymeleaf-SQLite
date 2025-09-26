package com.curso.marcos_de_desarroll_web.springboot.web.springboot_web.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario") 
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre; 

    @Column(nullable = false, unique = true)
    private String username; 

    @Column(nullable = false)
    private String password; 

    public Usuario() {}

    public Usuario(String nombre, String username, String password) {
        this.nombre = nombre;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
