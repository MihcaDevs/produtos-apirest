package com.produto.demo_apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produto.demo_apirest.models.Produto;

public interface ProdutoRepository  extends JpaRepository<Produto, Long>{
	
	

}
