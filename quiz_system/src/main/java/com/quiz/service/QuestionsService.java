package com.quiz.service;

import java.util.List;

import com.quiz.model.Attempt;
import com.quiz.model.Questionmodel;

public interface QuestionsService {

	public  Questionmodel storeQuestions(Questionmodel question);
	public  List<Questionmodel> getQuestionmodels();
	public  int getResults(List<Questionmodel> questionmodels);
	public  List<Attempt> getAttempts();
	public  Attempt storeAttempts(Attempt at);
}
