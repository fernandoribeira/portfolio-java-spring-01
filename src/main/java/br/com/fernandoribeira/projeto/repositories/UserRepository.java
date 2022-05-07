package br.com.fernandoribeira.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fernandoribeira.projeto.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}
