package com.service.caja.service.impl;

  
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.service.caja.entity.Caja; 
import com.service.caja.repository.BaseRepository;
import com.service.caja.repository.CajaRepository;
import com.service.caja.service.CajaService; 

@Service
public class CajaServiceImpl extends BaseServiceImpl<Caja, Long> implements CajaService{
	

	@Autowired
	private CajaRepository cajaRepository;
	   
 
	
	public CajaServiceImpl(BaseRepository<Caja, Long> baseRepository) {
		super(baseRepository);
		// TODO Auto-generated constructor stub
	}

	 

 
	
  
}
