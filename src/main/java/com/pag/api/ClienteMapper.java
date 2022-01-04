package com.pag.api;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel="spring")
public interface ClienteMapper {

	public abstract Cliente toEntity (ClienteDTO cliente);
	
	@InheritInverseConfiguration
	public abstract ClienteDTO toDto (Cliente cliente);
}
