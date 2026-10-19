package com.programacionweb.backend1.services;

import com.programacionweb.backend1.models.Usuario;
import com.programacionweb.backend1.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public Usuario guardar(Usuario usuario) {
        // Encriptar el texto plano de la contraseña antes de guardar
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword() ));
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> obtenerTodos() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> obtenerPorId(Long id) {
        return usuarioRepository.findById(id);
    }

}