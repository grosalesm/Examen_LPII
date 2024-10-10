package com.cibertec.app.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "producto")
public class Producto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProd;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="precio")
	private BigDecimal precio;
	
	@Column(name="stock")
	private int stock;
	
	@ManyToOne
	@JoinColumn(name="idcate")
	private Categoria categoria;
	
	public Producto() {
		
	}
}
