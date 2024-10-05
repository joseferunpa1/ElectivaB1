package com.co.electiva.mappers;

import com.co.electiva.dtos.ProductoDTO;
import com.co.electiva.models.Producto;

public interface ProductoMapper {
	
	ProductoDTO toProductoDTO(Producto producto);
	Producto toProducto(ProductoDTO productoDTO);
	

}
