package com.nitie.bgyan.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nitie.bgyan.model.Abstract;

public interface AbstractRepo extends PagingAndSortingRepository<Abstract, Integer> {

	Page<Abstract> findById(long id,Pageable pageable);
}
