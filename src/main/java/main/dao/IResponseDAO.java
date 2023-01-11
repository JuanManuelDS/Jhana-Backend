package main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import main.dto.Response;
import main.dto.Threads;

public interface IResponseDAO extends JpaRepository<Response, Long>{
	
	public List<Response> findByThread(Threads threads);

}
