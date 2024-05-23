package com.service.cliente.entity;
 
import java.sql.Date; 
import jakarta.persistence.Column;
import jakarta.persistence.Entity; 
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="cliente")
@Data @AllArgsConstructor @NoArgsConstructor
public class Cliente  extends Base{
	private static final long serialVersionUID = 1L;
 
	@Column(name="nombre_cliente")
	private String nombre_cliente;

	@Column(name="apellido_cliente")
	private String apellido_cliente;
 
}
