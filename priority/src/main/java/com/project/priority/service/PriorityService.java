package com.project.priority.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.priority.entity.Priority;
import com.project.priority.repository.Priorityrepo;

@Service
public class PriorityService {

	@Autowired
	private Priorityrepo priorityrepo;
	
	public Priority get_data()
	{
		return priorityrepo.get_data();
	}
	
	public void insert_data(Priority obj)
	{
		priorityrepo.save(obj);
	}
	
}
