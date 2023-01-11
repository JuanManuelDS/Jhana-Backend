package main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import main.dto.Threads;
import main.dto.User;

public interface IThreadDAO extends JpaRepository<Threads, Long> {

	public List<Threads> findByUser(User user);
}
