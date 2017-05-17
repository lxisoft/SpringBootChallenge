package com.lxisoft.CandidateDetails.repository;

import javax.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lxisoft.CandidateDetails.model.Candidate;

@Repository
@Table(name ="candidate")
public interface CandidateRepo extends JpaRepository<Candidate,Integer>{

}
