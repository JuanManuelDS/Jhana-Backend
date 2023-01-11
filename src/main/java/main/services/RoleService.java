package main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.IRoleDAO;
import main.dto.Role;

@Service
public class RoleService {

	@Autowired
	IRoleDAO iRoleDAO;
	
	public Role findRoleByName(String name) {
		return iRoleDAO.findByName(name);
	}

}
