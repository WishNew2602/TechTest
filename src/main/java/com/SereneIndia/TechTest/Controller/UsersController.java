package com.SereneIndia.TechTest.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SereneIndia.TechTest.Service.UsersService;
import com.SereneIndia.TechTest.Model.Users;

@RestController
@RequestMapping("users")
public class UsersController {

	 private static final Logger logger = LoggerFactory.getLogger(UsersController.class);
	 
	@Autowired
	UsersService userService;
	
	@GetMapping("/allusers")
	public List<Users> getAllUsers() {
		//return userService.getAllUsers();
		List<Users> users = userService.getAllUsers();
        logger.debug("Fetched users: {}", users);
        return users;
	}
	
	@GetMapping("/allusers/{techStack}")
	public List<Users> getUsersByTechStack(@PathVariable("techStack") String techStack) {
		return userService.getUsersByTechStack(techStack);
	}
	
	/*@PostMapping("/allusers")
	public String putUser() {
		return null;
		
	}*/
}
