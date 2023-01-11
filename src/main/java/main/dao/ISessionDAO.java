package main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import main.dto.Session;
import main.dto.User;

public interface ISessionDAO extends JpaRepository<Session, Long>{
	
	public List<Session> findByUser (User user);
}
