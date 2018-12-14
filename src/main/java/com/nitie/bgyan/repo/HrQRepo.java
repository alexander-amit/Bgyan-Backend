package com.nitie.bgyan.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.nitie.bgyan.model.HrQ;

@Repository
public interface HrQRepo extends PagingAndSortingRepository<HrQ, Integer> {

	@Query("Select * from  hrq order by rand() limit 25")
	Iterable<HrQ> find25RandomRecord();

}
