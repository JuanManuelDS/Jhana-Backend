package main.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import main.dto.User;

public interface IUserDAO extends JpaRepository<User, Long> {
	
	Page<User> findAll(Pageable pageable);
	
	public User findByEmail(String email);
	
}
