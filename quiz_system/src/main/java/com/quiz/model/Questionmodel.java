package com.quiz.model;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Questionmodel {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qid;
	private String questionname;
	private String optiona; 
	private String optionb; 
	private int correctAnswer;
	private int chosenAnswer=5;
	
	public Questionmodel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Questionmodel(int qid, String questionname, String optiona, String optionb , int correctAnswer) {
		super();
		this.qid=qid;
		this.questionname = questionname;
		  this.optiona=optiona; 
		  this.optionb=optionb;
		this.correctAnswer = correctAnswer;
		System.out.println(questionname+optiona+optionb+correctAnswer);
	}
	
	
	
	public Questionmodel(String questionname, String optiona, String optionb, int correctAnswer, int chosenAnswer) {
		super();
		this.questionname = questionname;
		this.optiona = optiona;
		this.optionb = optionb;
		this.correctAnswer = correctAnswer;
		this.chosenAnswer = chosenAnswer;
	}
	public Questionmodel(int correctAnswer, int chosenAnswer) {
		super();
		this.correctAnswer = correctAnswer;
		this.chosenAnswer = chosenAnswer;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestionname() {
		return questionname;
	}
	public void setQuestionname(String questionname) {
		this.questionname = questionname;
	}
	
	
	public String getOptiona() {
		return optiona;
	}
	public void setOptiona(String optiona) {
		this.optiona = optiona;
	}
	public String getOptionb() {
		return optionb;
	}
	public void setOptionb(String optionb) {
		this.optionb = optionb;
	}
	public int getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	public int getChosenAnswer() {
		return chosenAnswer;
	}
	public void setChosenAnswer(int chosenAnswer) {
		this.chosenAnswer = chosenAnswer;
	}
	
	public boolean evaluateAnswers() {
		if(this.chosenAnswer==this.correctAnswer) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
	
	

}
