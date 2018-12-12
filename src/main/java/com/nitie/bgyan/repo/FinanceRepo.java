package com.nitie.bgyan.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nitie.bgyan.model.Finance;

public interface FinanceRepo extends PagingAndSortingRepository<Finance, Integer> {

	Page<Finance> findById(long id,Pageable pageable);
}
