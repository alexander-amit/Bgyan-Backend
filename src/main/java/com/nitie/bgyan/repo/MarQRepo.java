package com.nitie.bgyan.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nitie.bgyan.model.MarQ;

@Repository
public interface MarQRepo extends JpaRepository<MarQ, Integer> {

	Page<MarQ> findById(long id,Pageable pageable);
	
	@Query(value = "Select t from  MarQ t order by rand()", nativeQuery = true)
	List<MarQ> find25RandomRecord();

}
