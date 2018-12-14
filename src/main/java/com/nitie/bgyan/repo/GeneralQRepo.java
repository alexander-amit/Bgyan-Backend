package com.nitie.bgyan.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.nitie.bgyan.model.GeneralQ;

@Repository
public interface GeneralQRepo extends PagingAndSortingRepository<GeneralQ, Integer> {

	@Query("Select * from  generalq order by rand() limit 25")
	Iterable<GeneralQ> find25RandomRecord();

}
