package com.cjc.springbootcrudoperation.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.springbootcrudoperation.model.Student;
@Repository
public interface StudentRepositary extends JpaRepository<Student, Integer>
{

	List<Student> findByUsernameAndPassword(String username, String password);
	

}
