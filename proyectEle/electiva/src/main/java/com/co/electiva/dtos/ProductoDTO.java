package com.co.electiva.dtos;


public class ProductoDTO {
	private Long productoId;
	private String codigo;
	private String estado;
	private String nombre;
	private String descripcion;
	private String observacion;
	private Double saldoMinimo;
	private Double saldoMaximo;
	private Long tipoProdId;
	private Long udadMedProd;
	private Long almacenId;
	private String fechaCreacion;
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
