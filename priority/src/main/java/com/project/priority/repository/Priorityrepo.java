package com.project.priority.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.priority.entity.Priority;

@Repository
public interface Priorityrepo extends CrudRepository<Priority,Integer>{

	@Query(value="select priority from priority_table",nativeQuery=true)
	@Transactional
	public Priority get_data();
}
