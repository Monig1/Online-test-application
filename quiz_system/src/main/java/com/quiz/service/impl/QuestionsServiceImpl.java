package com.quiz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quiz.dao.AttemptDao;
import com.quiz.dao.QuestionsDao;
import com.quiz.model.Attempt;
import com.quiz.model.Questionmodel;
import com.quiz.service.QuestionsService;

@Service
public class QuestionsServiceImpl implements QuestionsService {
	
	@Autowired
	private QuestionsDao dao;
	@Autowired
	private AttemptDao  adao;
	
	@Override
	public Questionmodel storeQuestions(Questionmodel question) {
		
		return dao.save(question);
		
	}

	@Override
	public List<Questionmodel> getQuestionmodels() {
		
		return dao.findAll();
	}

	@Override
	public int getResults(List<Questionmodel> questionmodels) {
		int res=0;
		for(Questionmodel q:questionmodels) {
			
			if(q.evaluateAnswers()) {
				res++;
			}
		}
		
		return res;
	}

	@Override
	public List<Attempt> getAttempts() {
		try {
		return adao.findAll();
	}
		catch(Exception e){
		return null;
	}

}

	@Override
	public Attempt storeAttempts(Attempt at) {
		
		return adao.save(at);
	}
	}

