package main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.IResponseDAO;
import main.dto.Response;
import main.dto.Threads;

@Service
public class ResponseService {

	@Autowired
	IResponseDAO iResponseDAO;
	
	public List<Response> findByThread (Threads threads){
		return iResponseDAO.findByThread(threads);
	}
	
	public Response saveResponse(Response response) {
		return iResponseDAO.save(response);
	}
	
	public void deleteResponse(Long id) {
		iResponseDAO.deleteById(id);
	}
}
