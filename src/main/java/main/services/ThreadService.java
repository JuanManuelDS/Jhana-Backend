package main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.IThreadDAO;
import main.dto.Threads;

@Service
public class ThreadService {

	@Autowired
	IThreadDAO iThreadDAO;
	
	public List<Threads> listAll(){
		return iThreadDAO.findAll();
	}
	
	public void deleteThread(Long id) {
		iThreadDAO.deleteById(id);
	}
	
	public Threads findThreadById(Long id) {
		return iThreadDAO.findById(id).get();
	}
	
	public Threads saveThread(Threads threads) {
		return iThreadDAO.save(threads);
	}
	
	public Threads updateThread (Threads threads) {
		return iThreadDAO.save(threads);
	}
}
