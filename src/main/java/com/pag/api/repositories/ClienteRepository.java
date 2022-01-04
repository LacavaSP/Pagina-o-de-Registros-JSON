package com.pag.api.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pag.api.model.Cliente;

@Repository	
public interface ClienteRepository extends  JpaRepository<Cliente, Long>{

	@Query("from Cliente c where c.cpf <> null")
	Page<Cliente>getAPageWithClientes(Pageable pageable);
	
}
