package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.OilBase;

@Repository
@Transactional
public interface OilBaseRepo<T extends OilBase> extends CrudRepository<T, Integer> {
	
}