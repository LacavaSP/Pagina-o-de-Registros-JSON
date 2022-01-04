package com.pag.api.resources;
import static com.pag.api.util.PaginationUtil.generatePaginationHttpHeaders;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pag.api.dtos.ClienteDTO;
import com.pag.api.services.ClienteService;

@RestController
@RequestMapping("/api")
public class ClienteResource {

	private ClienteService clienteService;
	private String URI = "/api/";
	
	public ClienteResource(ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	@GetMapping("/clientes")
	public ResponseEntity<List<ClienteDTO>> getAllClientes(Pageable pageable) {
		Page<ClienteDTO> page = getPage(pageable);
		return ResponseEntity.ok().headers(getHeaders(page)).body(page.getContent());
	}
	
	public Page<ClienteDTO> getPage(Pageable pageable){
		return clienteService.getAllClientes(pageable);
	}
	
	public HttpHeaders getHeaders(Page<ClienteDTO> page) {
		return generatePaginationHttpHeaders(page, "/api/funcionario-aviso-faltas");
	}
		  
}
