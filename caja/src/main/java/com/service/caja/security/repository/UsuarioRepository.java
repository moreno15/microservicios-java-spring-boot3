package com.service.caja.security.repository;
 
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
 
import com.service.caja.security.entity.Usuario; 

@Repository
public interface UsuarioRepository extends BaseRepository<Usuario, Long>{
	 Optional<Usuario> findByUsuario(String usuario);
}
