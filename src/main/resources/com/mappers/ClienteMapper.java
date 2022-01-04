package com.pag.api.mappers;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.pag.api.dtos.ClienteDTO;
import com.pag.api.model.Cliente;

@Mapper(componentModel = "spring") 
public interface ClienteMapper{
	public static final ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);
	
	public abstract Cliente toEntity (ClienteDTO dto);
	
	@InheritInverseConfiguration
	public abstract ClienteDTO toDto (Cliente cliente);
	
}
