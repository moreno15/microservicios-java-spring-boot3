package com.service.cliente.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.service.cliente.entity.Cliente;
 

@Repository
public interface ClienteRepository extends BaseRepository<Cliente, Long>{
	 
 
	  
}
