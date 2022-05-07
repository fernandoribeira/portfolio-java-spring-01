package br.com.fernandoribeira.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fernandoribeira.projeto.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
