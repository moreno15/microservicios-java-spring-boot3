package com.service.caja.security.controller;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.service.caja.security.entity.Base; 
import com.service.caja.security.service.impl.BaseServiceImpl;

import java.io.Serializable;
import java.util.List;

public abstract class BaseControllerImpl<E extends Base, S extends BaseServiceImpl<E, Long>> implements BaseController<E, Long> {

    @Autowired
    protected S servicio;

    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
        	
         
             return ResponseEntity.status(HttpStatus.OK).body( servicio.findAll());
              
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

    @GetMapping("/pagina")
    public ResponseEntity<?> getAll( 
    		@RequestParam(defaultValue = "0") int page,
    		@RequestParam(defaultValue = "10") int size,
    		@RequestParam(defaultValue = "id")  String order,
    		@RequestParam(defaultValue = "true") boolean asc
    		) {
        try { 
        	 
        	if(!asc) {
        		return ResponseEntity.status(HttpStatus.OK).body(servicio.findAll(PageRequest.of(page, size, Sort.by(order).descending())));
        	}else {
        		return ResponseEntity.status(HttpStatus.OK).body(servicio.findAll(PageRequest.of(page, size, Sort.by(order))));
        	} 
            
            
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody E entity){
        try { 
            return ResponseEntity.status(HttpStatus.OK).body(servicio.save(entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,@RequestBody E entity) {
        try { 
            return ResponseEntity.status(HttpStatus.OK).body(servicio.update(id, entity));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
           return ResponseEntity.status(HttpStatus.OK).body(servicio.delete(id));
             
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"mensaje\":\"Error. Por favor intente más tarde.\"}");
        }
    }

}
