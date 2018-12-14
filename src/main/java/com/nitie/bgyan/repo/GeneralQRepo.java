package com.nitie.bgyan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nitie.bgyan.model.GeneralQ;

@Repository
public interface GeneralQRepo extends JpaRepository<GeneralQ, Integer> {

	@Query(value = "Select t from  GeneralQ t order by rand()", nativeQuery = true)
	List<GeneralQ> find25RandomRecord();

}
