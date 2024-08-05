package com.cjc.springbootcrudoperation.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.springbootcrudoperation.model.Student;
import com.cjc.springbootcrudoperation.repositary.StudentRepositary;
import com.cjc.springbootcrudoperation.servicei.StudentServicei;
@Service
public class Studentserviceimpl implements StudentServicei
{
   @Autowired
   StudentRepositary sr;
	
	@Override
	public void savedata(Student s)
	{
		sr.save(s);
	}

	@Override
	public List<Student> getdata(String username, String password) {
		if(username.equals("admin")&&password.equals("admin"))
		{
			return sr.findAll();
		}
		else
		{
			return sr.findByUsernameAndPassword(username,password);
		}
	}

	@Override
	public List<Student> deletedata(int rollno) {
		sr.deleteById(rollno);
		return sr.findAll();
	}

	@Override
	public Student editdata(int rollno) {
		Optional<Student> optional=sr.findById(rollno);
		 return optional.get();
 	}

	@Override
	public List<Student> updatedata(Student s) {
		sr.save(s);
		return sr.findAll();
	}

	
}
