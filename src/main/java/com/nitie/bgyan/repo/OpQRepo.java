package com.nitie.bgyan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nitie.bgyan.model.OpQ;

@Repository
public interface OpQRepo extends JpaRepository<OpQ, Integer> {

	@Query(value = "Select t from  OpQ t order by rand()", nativeQuery = true)
	List<OpQ> find25RandomRecord();

}
