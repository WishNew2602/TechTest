package com.SereneIndia.TechTest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SereneIndia.TechTest.DAO.UsersDao;
import com.SereneIndia.TechTest.Model.Users;

@Service
public class UsersService {

	@Autowired
	UsersDao usersDao;
	
	public List<Users> getAllUsers(){
		return usersDao.findAll();
	}
	
	/*public String putUser(Users user) {
		
		usersDao.save(user);
		return "Success ";
		 
	}*/

	public List<Users> getUsersByTechStack(String techStack) {
		return usersDao.findByTechstack(techStack);
	}
}
