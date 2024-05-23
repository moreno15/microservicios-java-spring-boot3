package com.service.auth.service;

import com.service.auth.dao.request.SignUpRequest;
import com.service.auth.dao.request.SigninRequest;
import com.service.auth.dao.response.JwtAuthenticationResponse;
 

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
