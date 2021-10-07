package com.revature.project1.services;

import java.util.List;

import com.revature.project1.models.Role;
import com.revature.project1.daos.RoleDaoImpl;

public class RoleService {
	private RoleDaoImpl rDao;
	
	public RoleService() {
	}

	public RoleService(RoleDaoImpl rDao) {
		this.rDao = rDao;
	}
	
	public List<Role> getAllRoles() {
		return rDao.getAll();
	}
	
	public Role getRoleByName(String name) {
		Role role = rDao.getByName(name);
		if (role == null) {
			throw new NullPointerException("There isn't a role with name: " + name);
		}
		return role;
	}
	
	public Role getRoleById(int id) {
		Role role = rDao.getById(id);
		if (role == null) {
			throw new NullPointerException("There isn't a role with id: " + id);
		}
		return role;
	}
}
