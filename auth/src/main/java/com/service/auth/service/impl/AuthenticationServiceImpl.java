package com.service.auth.service.impl;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.service.auth.dao.request.SignUpRequest;
import com.service.auth.dao.request.SigninRequest;
import com.service.auth.dao.response.JwtAuthenticationResponse;
import com.service.auth.entity.Role;
import com.service.auth.entity.Usuario;
import com.service.auth.repository.UsuarioRepository;
import com.service.auth.service.AuthenticationService;
import com.service.auth.service.JwtService; 
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UsuarioRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    @Override
    public JwtAuthenticationResponse signup(SignUpRequest request) {
        var user = Usuario.builder().nombre(request.getNombre()).apellido(request.getApellido())
                .usuario(request.getUsuario()).password(passwordEncoder.encode(request.getPassword()))
                .role(Role.USER).build();
        userRepository.save(user);
        var jwt = jwtService.generateToken(user);
        return JwtAuthenticationResponse.builder().token(jwt).build();
    }

    @Override
    public JwtAuthenticationResponse signin(SigninRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getUsuario(), request.getPassword()));
        var user = userRepository.findByUsuario(request.getUsuario())
                .orElseThrow(() -> new IllegalArgumentException("Invalid email or password."));
        var jwt = jwtService.generateToken(user);
        return JwtAuthenticationResponse.builder().token(jwt).build();
    }
}
