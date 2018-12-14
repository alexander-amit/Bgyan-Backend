package com.nitie.bgyan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nitie.bgyan.model.HrQ;

@Repository
public interface HrQRepo extends JpaRepository<HrQ, Integer> {

	@Query(value = "Select t from  HrQ t order by rand()", nativeQuery = true)
	List<HrQ> find25RandomRecord();

}
