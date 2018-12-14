package com.nitie.bgyan.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.nitie.bgyan.model.MarQ;

@Repository
public interface MarQRepo extends PagingAndSortingRepository<MarQ, Integer> {

	Page<MarQ> findById(long id,Pageable pageable);
	
	@Query("Select * from  marq order by rand() limit 25")
	Iterable<MarQ> find25RandomRecord();

}
