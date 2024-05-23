package com.service.auth.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority; 
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
  
import com.service.auth.entity.Usuario;
import com.service.auth.repository.BaseRepository; 
import com.service.auth.repository.UsuarioRepository;
import com.service.auth.service.UsuarioService;

import lombok.RequiredArgsConstructor;


@Service 
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario, Long> implements UsuarioService{
	
	@Autowired
	private UsuarioRepository  usuarioRepository;
	
	public UsuarioServiceImpl(BaseRepository<Usuario, Long> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}
	

	    @Override
	    public UserDetailsService userDetailsService() {
	        return new UserDetailsService() {
	            @Override
	            public UserDetails loadUserByUsername(String username) {
	                return usuarioRepository.findByUsuario(username)
	                        .orElseThrow(() -> new UsernameNotFoundException("User not found"));
	            }
	        };
	    }

}
