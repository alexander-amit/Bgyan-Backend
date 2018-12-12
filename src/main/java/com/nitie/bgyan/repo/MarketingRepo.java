package com.nitie.bgyan.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nitie.bgyan.model.Finance;
import com.nitie.bgyan.model.Marketing;

public interface MarketingRepo extends PagingAndSortingRepository<Marketing, Integer> {

	Page<Marketing> findById(long id,Pageable pageable);
}
