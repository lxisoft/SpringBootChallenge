package com.lxisoft;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface HrDbRepo extends JpaRepository<Hr,Integer> {

}
