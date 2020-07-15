package com.quiz.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.model.Questionmodel;

@Repository
public interface QuestionsDao extends JpaRepository<Questionmodel, Integer>{
	
	

}
