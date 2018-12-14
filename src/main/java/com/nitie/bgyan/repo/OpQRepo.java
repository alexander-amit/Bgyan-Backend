package com.nitie.bgyan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.nitie.bgyan.model.OpQ;

@Repository
public interface OpQRepo extends PagingAndSortingRepository<OpQ, Integer> {

	@Query("Select t from  OpQ t order by rand()")
	List<OpQ> find25RandomRecord();

}
