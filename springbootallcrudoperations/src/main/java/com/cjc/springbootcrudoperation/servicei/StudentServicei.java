package com.cjc.springbootcrudoperation.servicei;

import java.util.List;

import com.cjc.springbootcrudoperation.model.Student;

public interface StudentServicei {

	void savedata(Student s);

	List<Student> getdata(String username, String password);

	List<Student> deletedata(int rollno);

	Student editdata(int rollno);

	List<Student> updatedata(Student s);

}
