package com.co.electiva.services;

import java.util.List;

import com.co.electiva.models.Producto;

public interface ProductoService {
	
	public Producto saveProducto(Producto producto) throws Exception;
	
	public Producto getProductoById(Long id) throws Exception;
	
	public List<Producto> getAllProductos() throws Exception;
	
	public Producto updateProducto(Producto producto) throws Exception;
	
	public void deleteProducto(Long id) throws Exception;
	
	

}
