package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class GenericRepository<T, R> implements CrudRepository<T, R> {

}
