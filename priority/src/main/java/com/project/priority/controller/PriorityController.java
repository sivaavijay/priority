package com.project.priority.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.priority.entity.Priority;
import com.project.priority.service.PriorityService;

@RestController
public class PriorityController {

	//This is used to create object
	@Autowired
	private PriorityService priorityservice;
	
	//This function is used to get data
	
	@GetMapping("/getdata")
	public Priority get_data()
	{
		return priorityservice.get_data();
	}
	
	//This funtion is used to insert data
	
	@PostMapping("/insert")
	public String insert_data(@RequestBody Priority obj)
	{
		priorityservice.insert_data(obj);
		return "Data Inserted Successfully";
	}
}
