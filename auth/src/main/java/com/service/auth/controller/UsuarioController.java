package com.service.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.auth.dao.request.SignUpRequest;
import com.service.auth.dao.request.SigninRequest;
import com.service.auth.dao.response.JwtAuthenticationResponse;
import com.service.auth.entity.Usuario;
import com.service.auth.service.AuthenticationService;
import com.service.auth.service.impl.UsuarioServiceImpl;

import lombok.RequiredArgsConstructor;

@RequestMapping("auth/api/v1/usuario")
@RequiredArgsConstructor
@RestController 
@CrossOrigin 
public class UsuarioController extends BaseControllerImpl<Usuario, UsuarioServiceImpl>{
	
    private final AuthenticationService authenticationService;
    @PostMapping("/registrar")
    public ResponseEntity<JwtAuthenticationResponse> signup(@RequestBody SignUpRequest request) {
        return ResponseEntity.ok(authenticationService.signup(request));
    }

    @PostMapping("/login")
    public ResponseEntity<JwtAuthenticationResponse> signin(@RequestBody SigninRequest request) {
        return ResponseEntity.ok(authenticationService.signin(request));
    }
}
