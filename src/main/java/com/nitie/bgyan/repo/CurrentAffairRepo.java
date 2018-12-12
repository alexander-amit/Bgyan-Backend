package com.nitie.bgyan.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nitie.bgyan.model.CurrentAffair;

public interface CurrentAffairRepo extends PagingAndSortingRepository<CurrentAffair, Integer> {

	Page<CurrentAffair> findById(long id,Pageable pageable);
}
