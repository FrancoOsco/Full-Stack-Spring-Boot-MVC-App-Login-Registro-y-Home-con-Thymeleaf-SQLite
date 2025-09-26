# Sistema de Gestión de Usuarios - Login/Registro

Aplicación web desarrollada con **Spring Boot**, **Thymeleaf** y **SQLite** para la gestión de usuarios en un sistema de veterinaria.  
Permite registrar, iniciar sesión y administrar usuarios de manera segura con persistencia en base de datos.

## ✨ Características principales
- 🔐 Autenticación y registro de usuarios con Spring Security.
- 🏠 Páginas públicas y privadas (acceso controlado según login).
- 💾 Persistencia con SQLite y compatibilidad con DB Browser for SQLite.
- 🎨 Frontend integrado con Thymeleaf (HTML5, CSS3, Bootstrap).
- ⚡ Flujo seguro de login usando AuthenticationManager, UserDetailsService y CustomUserDetailsService.

## 🛠️ Tecnologías utilizadas
**Backend:** Spring Boot (Java 17+), Spring Security  
**Frontend:** Thymeleaf, HTML5, CSS3, Bootstrap  
**Base de datos:** SQLite3  
**IDE recomendado:** IntelliJ IDEA / VS Code  
**Control de versiones:** Git & GitHub  

## 📂 Estructura del proyecto
src/main/java/com/curso/marcos_de_desarroll_web/springboot/web/springboot_web/
│── config/ # Configuración de seguridad (SecurityConfig) y beans
│── controller/ # Controladores web (Spring MVC: login, registro, home)
│── model/ # Clases entidad (Usuario, etc.)
│── repository/ # Repositorios JPA para persistencia
│── service/ # Lógica de negocio (UsuarioService, CustomUserDetailsService)
│── SISTEMA/ # Implementación de estructuras de datos si aplica (pila, listas, etc.)
src/main/resources/
│── static/ # Archivos estáticos (CSS, JS, imágenes)
│── templates/ # Vistas Thymeleaf (login.html, registro.html, home.html, etc.)
│── application.properties
