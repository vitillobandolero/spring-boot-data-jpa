package com.bolsadeidias.springboot.data.jpa.app.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.bolsadeidias.springboot.data.jpa.app.models.entity.Cliente;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>{
	
	

}
