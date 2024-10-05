package com.co.electiva.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "almacen")

public class Almacen {
	@Id
	@GeneratedValue(strategy = GenerationType. IDENTITY)
	@Column(name = "almacenid")
	private Long almacenId;
	private String codigo;
	private String nombre;
	private String descripcion;
	private Double capacidad;
	
	public Long getAlmacenId() {
		return almacenId;
	}
	public void setAlmacenId(Long almacenId) {
		this.almacenId = almacenId;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(Double capacidad) {
		this.capacidad = capacidad;
	}
	
}
