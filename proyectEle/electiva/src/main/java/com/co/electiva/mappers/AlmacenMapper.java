package com.co.electiva.mappers;

import org.mapstruct.Mapper;

import com.co.electiva.dtos.AlmacenDTO;
import com.co.electiva.models.Almacen;

@Mapper(componentModel = "spring")
public interface AlmacenMapper {
	
	AlmacenDTO toAlmacenDTO(Almacen almacen);
	Almacen toAlmacen(AlmacenDTO almacenDTO);

	
}
