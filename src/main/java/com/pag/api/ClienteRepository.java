package com.pag.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository	
public interface ClienteRepository extends  JpaRepository<Cliente, Long>{

	@Query("from Cliente c where c.cpf <> null")
	Page<Cliente>getAPageWithClientes(Pageable pageable);
	
}
