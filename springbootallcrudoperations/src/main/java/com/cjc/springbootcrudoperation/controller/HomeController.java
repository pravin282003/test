package com.cjc.springbootcrudoperation.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.springbootcrudoperation.model.Student;
import com.cjc.springbootcrudoperation.servicei.StudentServicei;

@Controller
public class HomeController
{
	@Autowired
	StudentServicei ssi;
	
	
	Map<String,Integer> map = new HashMap();
	{
		map.put("indapur", 413525);
		map.put("Bhoom", 413504);
	}
	
	
	@RequestMapping("/")
	public String prelogin()
	{
		return "login";	
	}
    @RequestMapping("/openreg")
	public String preregister()
	{
		return "register";
	}
    @RequestMapping("/save")
    public String savedata(@ModelAttribute Student s)
    {
    	ssi.savedata(s);
    	return "login";
    }
    @RequestMapping("/log")
	 public String getdata(@RequestParam("username") String username,@RequestParam("password")String password,Model m)
	 {
		      List<Student> list=ssi.getdata(username,password);
		      if(!list.isEmpty())
		      {
		    	  m.addAttribute("data", list);
		    	  return "success";
		      }
		      else
		      {
		    	  return "login";
		      }
	 }
    @RequestMapping("/delete")
    public String deletedata(@RequestParam("rollno") int rollno,Model m)
    {
    	   List<Student> list= ssi.deletedata(rollno);
    	   m.addAttribute("data", list);
    	   return "success";
    }
     @RequestMapping("/edit")
      public String editdata(@RequestParam("rollno") int rollno,Model m)
      {
    	      Student s=ssi.editdata(rollno);
    	      m.addAttribute("stu", s);
    	      return "edit";
    	  
      }
     @RequestMapping("/update")
     public String updatedata(@ModelAttribute Student s,Model m)
     {
    	 List<Student> list=ssi.updatedata(s);
    	 m.addAttribute("data", list);
    	 return "success";
     }
     
     
     

}
