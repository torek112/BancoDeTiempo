package com.zahirasoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zahirasoft.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	User findByIdUser(Long idUser);
	User findByUserName(String username);
}
