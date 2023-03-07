package com.fieb.rastreamentoUserRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fieb.rastreamento.model.User;



@Repository
public interface UserRepositry extends JpaRepository<User, Long> {
	
	User findbyEmail(String email);

}
