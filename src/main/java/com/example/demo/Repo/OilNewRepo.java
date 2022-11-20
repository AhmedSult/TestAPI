package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.OilNew;

@Repository
@Transactional
public interface OilNewRepo<T extends OilNew> extends CrudRepository<T, Integer> {
	
}