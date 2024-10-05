package com.co.electiva.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movimientos")

public class Movimientos {
	@Id
	@GeneratedValue(strategy = GenerationType. IDENTITY)
	@Column(name = "movimientosid")
	private Long movimivientosId;
	private Date fecha;
	@Column(name = "almacenid")
	private Long almacenId;
	@Column(name = "productoid")
	private Long productoId;
	@Column(name = "valorunitario")
	private Double valorUnitario;
	private Double cantidad;
	@Column(name = "valortotal")
	private Double valorTotal;
	@Column(name = "tipoMovimiento")
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
