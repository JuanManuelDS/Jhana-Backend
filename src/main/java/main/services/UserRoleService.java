package main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.IUserRoleDAO;
import main.dto.User;
import main.dto.UserRole;

@Service
public class UserRoleService {
	
	@Autowired
	IUserRoleDAO iUserRoleDAO;
	
	public UserRole saveUserRole(UserRole userRole) {
		return iUserRoleDAO.save(userRole);
	}
	
	public List<UserRole> findAllUserRole(){
		return iUserRoleDAO.findAll();
	}
	
	public List<UserRole> findUserRoles(User user){
		return iUserRoleDAO.findByUser(user);
	}
}
