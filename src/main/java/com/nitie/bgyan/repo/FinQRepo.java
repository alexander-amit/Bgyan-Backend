package com.nitie.bgyan.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.nitie.bgyan.model.FinQ;

@Repository
public interface FinQRepo extends PagingAndSortingRepository<FinQ, Integer> {

	Page<FinQ> findById(long id, Pageable pageable);

	@Query("Select * from  finq order by rand() limit 25")
	Iterable<FinQ> find25RandomRecord();
}
