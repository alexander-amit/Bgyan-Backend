package com.nitie.bgyan.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nitie.bgyan.model.FinQ;

@Repository
public interface FinQRepo extends JpaRepository<FinQ, Integer> {

	Page<FinQ> findById(long id, Pageable pageable);

	@Query(value = "Select t from  FinQ t order by rand()", nativeQuery = true)
	List<FinQ> find25RandomRecord();
}
