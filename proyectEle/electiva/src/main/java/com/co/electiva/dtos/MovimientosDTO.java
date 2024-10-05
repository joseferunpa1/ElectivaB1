package com.co.electiva.dtos;

import java.util.Date;


public class MovimientosDTO {
	private Long movimivientosId;
	private Date fecha;
	private Long almacenId;
	private Long productoId;
	private Double valorUnitario;
	private Double cantidad;
	private Double valorTotal;
	private String tipomovimiento;
	private String observacion;
	
	public Long getMovimivientosId() {
		return movimivientosId;
	}
	public void setMovimivientosId(Long movimivientosId) {
		this.movimivientosId = movimivientosId;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Long getAlmacenId() {
		return almacenId;
	}
	public void setAlmacenId(Long almacenId) {
		this.almacenId = almacenId;
	}
	public Long getProductoId() {
		return productoId;
	}
	public void setProductoId(Long productoId) {
		this.productoId = productoId;
	}
	public Double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public Double getCantidad() {
		return cantidad;
	}
	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getTipomovimiento() {
		return tipomovimiento;
	}
	public void setTipomovimiento(String tipomovimiento) {
		this.tipomovimiento = tipomovimiento;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	

}
