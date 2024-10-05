package com.co.electiva.mappers;

import com.co.electiva.dtos.MovimientosDTO;
import com.co.electiva.models.Movimientos;

public interface MovimientosMapper {
	
	MovimientosDTO toMovimientosDTO(Movimientos movimientos);
	Movimientos toMovimientos(MovimientosDTO movimientosDTO);

}
