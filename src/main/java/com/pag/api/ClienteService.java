package com.pag.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ClienteMapper mapper;
	
	public ClienteService() {
	}
	
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;

	}
	
	public Page<ClienteDTO> getAllClientes(Pageable pageable){
		return clienteRepository.getAPageWithClientes(pageable).map(mapper::toDto);
	}
}
