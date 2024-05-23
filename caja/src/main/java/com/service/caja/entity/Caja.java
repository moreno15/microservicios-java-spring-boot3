package com.service.caja.entity;
 
import java.sql.Date; 
import jakarta.persistence.Column;
import jakarta.persistence.Entity; 
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 

@Entity
@Table(name="caja")
@Data @AllArgsConstructor @NoArgsConstructor
public class Caja  extends Base{ 
	private static final long serialVersionUID = 1L;
 
	@Column(name="fecha_apertura")
	private Date fecha_apertura;

	@Column(name="fecha_cierre")
	private Date fecha_cierre;

	@Column(name="monto_apertura")
	private Double monto_apertura;
 
	@Column(name="total_ingreso")
	private Double total_ingreso;

	@Column(name="total_egreso")
	private Double total_egreso ;

	@Column(name="total_sistema")
	private Double total_sistema ;
	
	@Column(name="total_cajero")
	private Double total_cajero ;
	
	@Column(name="diferencia")
	private Double diferencia ;
	
	@Column(name="estado")
	private boolean estado ;
  
}
