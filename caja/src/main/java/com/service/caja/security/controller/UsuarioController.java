package com.service.caja.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.caja.security.dao.request.SignUpRequest;
import com.service.caja.security.dao.request.SigninRequest;
import com.service.caja.security.dao.response.JwtAuthenticationResponse;
import com.service.caja.security.entity.Usuario;
import com.service.caja.security.service.AuthenticationService;
import com.service.caja.security.service.impl.UsuarioServiceImpl;

import lombok.RequiredArgsConstructor;

@RequestMapping("/auth/api/v1/")
@RequiredArgsConstructor
@RestController 
@CrossOrigin 
public class UsuarioController extends BaseControllerImpl<Usuario, UsuarioServiceImpl>{
	
    private final AuthenticationService authenticationService;
    @PostMapping("/regiter")
    public ResponseEntity<JwtAuthenticationResponse> signup(@RequestBody SignUpRequest request) {
        return ResponseEntity.ok(authenticationService.signup(request));
    }

    @PostMapping("/login")
    public ResponseEntity<JwtAuthenticationResponse> signin(@RequestBody SigninRequest request) {
        return ResponseEntity.ok(authenticationService.signin(request));
    }
}
