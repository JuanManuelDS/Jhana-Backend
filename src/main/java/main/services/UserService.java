package main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import main.dao.IUserDAO;
import main.dto.User;

@Service
public class UserService {

	@Autowired
	IUserDAO iUserDAO;
	
	public User findUserById(Long id) {
		return iUserDAO.findById(id).get();
	}
	
	public User saveUser(User user) {
		return iUserDAO.save(user);
	}
	
	public User updateUser(User user) {
		return iUserDAO.save(user);
	}
	
	public void deleteUserById (Long id) {
		iUserDAO.deleteById(id);
	}
	
	public User findUserByEmail(String email) {
		return iUserDAO.findByEmail(email);
	}
	
	public Page<User> listUsers(Pageable pageable) {
		return iUserDAO.findAll(pageable);
	}
}
