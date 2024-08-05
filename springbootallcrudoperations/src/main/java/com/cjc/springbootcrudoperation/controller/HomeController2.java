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
import org.springframework.web.bind.annotation.RestController;

import com.cjc.springbootcrudoperation.model.Student;
import com.cjc.springbootcrudoperation.servicei.StudentServicei;

@RestController("/home1")
public class HomeController2
{
	@Autowired
	StudentServicei ssi;
	
	
	Map<String,Integer> map = new HashMap();
	{
		map.put("indapur", 413525);
		map.put("Bhoom", 413504);
	}
	
	
     
     
     @GetMapping("/getPinCode")
     public Integer getPinCodeByCityName(@RequestParam("cityName") String cityName) {
    	 
    	 return map.get(cityName.toLowerCase());
     }

}
