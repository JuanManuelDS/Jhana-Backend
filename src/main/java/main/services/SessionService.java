package main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.ISessionDAO;
import main.dto.Session;
import main.dto.User;

@Service
public class SessionService {

	@Autowired
	ISessionDAO iSessionDAO;
	
	public List<Session> findByUser(User user){
		return iSessionDAO.findByUser(user);
	}
	
	public Session saveSession(Session session) {
		return iSessionDAO.save(session);
	}
	
	public Session updateSession(Session session) {
		return iSessionDAO.save(session);
	}
	
	public void deleteSession(Long id) {
		iSessionDAO.deleteById(id);
	}
}
