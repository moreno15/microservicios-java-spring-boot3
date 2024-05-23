package com.service.cliente.service.impl;

  
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.service.cliente.entity.Cliente;
import com.service.cliente.repository.BaseRepository;
import com.service.cliente.repository.ClienteRepository;
import com.service.cliente.service.ClienteService;

 

@Service
public class ClienteServiceImpl extends BaseServiceImpl<Cliente, Long> implements ClienteService{
	
	public ClienteServiceImpl(BaseRepository<Cliente, Long> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}
	 

	@Autowired
	private ClienteRepository cajaRepository;
	   
	
	 

 
	
  
}
