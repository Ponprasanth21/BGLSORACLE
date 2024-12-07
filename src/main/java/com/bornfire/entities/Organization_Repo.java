package com.bornfire.entities;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Organization_Repo extends CrudRepository<Organization_Entity, String>{
	
	@Query(value = "select * from BGLS_ORG_MASTER", nativeQuery = true)
	List<Organization_Entity> getAllList();

}
