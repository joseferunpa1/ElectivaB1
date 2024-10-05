package com.co.electiva.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")

public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType. IDENTITY)
	@Column(name = "productoid")
	private Long productoId;
	private String codigo;
	private String estado;
	private String nombre;
	private String descripcion;
	private String observacion;
	@Column(name = "saldo_minimo")
	private Double saldoMinimo;
	@Column(name = "saldo_maximo")
	private Double saldoMaximo;
	@Column(name = "tipo_prod_id")
	private Long tipoProdId;
	@Column(name = "udad_med_prod")
	private Long udadMedProd;
	@Column(name = "almacen_id")
	private Long almacenId;
	@Column(name = "fecha_creacion")
	private String fechaCreacion;
	@Column(name = "valor_unitario")
	private Double precio;
	
	public Long getProductoId() {
		return productoId;
	}
	public void setProductoId(Long productoId) {
		this.productoId = productoId;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
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
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public Double getSaldoMinimo() {
		return saldoMinimo;
	}
	public void setSaldoMinimo(Double saldoMinimo) {
		this.saldoMinimo = saldoMinimo;
	}
	public Double getSaldoMaximo() {
		return saldoMaximo;
	}
	public void setSaldoMaximo(Double saldoMaximo) {
		this.saldoMaximo = saldoMaximo;
	}
	public Long getTipoProdId() {
		return tipoProdId;
	}
	public void setTipoProdId(Long tipoProdId) {
		this.tipoProdId = tipoProdId;
	}
	public Long getUdadMedProd() {
		return udadMedProd;
	}
	public void setUdadMedProd(Long udadMedProd) {
		this.udadMedProd = udadMedProd;
	}
	public Long getAlmacenId() {
		return almacenId;
	}
	public void setAlmacenId(Long almacenId) {
		this.almacenId = almacenId;
	}
	public String getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
}

