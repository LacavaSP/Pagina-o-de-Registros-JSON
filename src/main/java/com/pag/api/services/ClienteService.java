package com.pag.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pag.api.dtos.ClienteDTO;
import com.pag.api.mappers.ClienteMapper;
import com.pag.api.repositories.ClienteRepository;

@Service
@Transactional
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	private ClienteMapper clienteMapper;
	
	public ClienteService(ClienteRepository clienteRepository, ClienteMapper clienteMapper) {
		this.clienteRepository = clienteRepository;
		this.clienteMapper = clienteMapper;
	}
	
	public Page<ClienteDTO> getAllClientes(Pageable pageable){
		return clienteRepository.getAPageWithClientes(pageable).map(clienteMapper::toDto);
	}
}
