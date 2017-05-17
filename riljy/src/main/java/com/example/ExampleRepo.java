package com.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleRepo extends JpaRepository<Example, String> {
	
	
	List<Example> findByname(String name);
}
