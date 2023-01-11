package main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import main.dto.User;
import main.dto.UserRole;

public interface IUserRoleDAO extends JpaRepository<UserRole, Long> {

	public List<UserRole> findByUser(User user);
}
