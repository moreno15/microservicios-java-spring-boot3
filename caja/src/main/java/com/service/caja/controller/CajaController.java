package com.service.caja.controller;

   
import java.sql.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.service.caja.entity.Caja;
import com.service.caja.service.impl.CajaServiceImpl;

import lombok.Getter;
import lombok.Setter;  

@RestController 
@CrossOrigin
@RequestMapping(path = "/caja/api/v1/caja") 
@Getter
@Setter
@RefreshScope
public class CajaController extends BaseControllerImpl<Caja, CajaServiceImpl>{
 
	@Value("${app.testProp}")
    private String testProp;

    @GetMapping("test-prop")
    public String getTestProp() {
        return this.testProp;
    }
 
     
}
