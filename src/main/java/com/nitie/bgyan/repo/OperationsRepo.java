package com.nitie.bgyan.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nitie.bgyan.model.Operations;

public interface OperationsRepo extends PagingAndSortingRepository<Operations, Integer> {

	Page<Operations> findById(long id,Pageable pageable);
}
