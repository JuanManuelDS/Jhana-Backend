package main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import main.dto.Role;

public interface IRoleDAO extends JpaRepository<Role, Long> {
	
	public Role findByName(String name);
}
