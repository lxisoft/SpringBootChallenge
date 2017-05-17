package com.lxisoft;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HrDbRepo extends JpaRepository<Hr,Integer> {

	List<Hr> findByusername(String username);

}
