package com.service.cliente.controller;

   
import java.sql.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.service.cliente.entity.Cliente;
import com.service.cliente.service.impl.ClienteServiceImpl;

import lombok.Getter;
import lombok.Setter;  

@RestController 
@CrossOrigin 
@RequestMapping(path = "/cliente/api/v1/cliente")
@Getter
@Setter
@RefreshScope
public class ClienteController extends BaseControllerImpl<Cliente, ClienteServiceImpl>{
 
	
	@Value("${app.testProp}")
    private String testProp;

    @GetMapping("test-prop")
    public String getTestProp() {
        return this.testProp;
    }
     
}
