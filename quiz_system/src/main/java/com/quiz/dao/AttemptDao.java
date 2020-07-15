package com.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.model.Attempt;

@Repository
public interface AttemptDao extends JpaRepository<Attempt, Integer>{
	
	

}
