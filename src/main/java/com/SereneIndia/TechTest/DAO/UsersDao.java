package com.SereneIndia.TechTest.DAO;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SereneIndia.TechTest.Model.Users;

@Repository
public interface UsersDao extends JpaRepository<Users, UUID>{

	List<Users> findByTechstack(String techStack);
}
