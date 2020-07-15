package com.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.model.Attempt;
import com.quiz.model.Questionmodel;
import com.quiz.service.QuestionsService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class QuestionsController {
	
	@Autowired
    private QuestionsService service;
	
	
	@PostMapping("/question")
	public Questionmodel storeQuestion(@RequestBody Questionmodel question) {
		
	 return service.storeQuestions(question);
	}
	
	@GetMapping("/questions")
	public List<Questionmodel> getQuestions(){
		Questionmodel q1=new Questionmodel(1,"What does HTML stand for?","Home Tool Markup Language","HyperText Markup Language",2);
		Questionmodel q2=new Questionmodel(2,"Which method can be used to find the length of a string in Java?","length()","len()",1);
		Questionmodel q3=new Questionmodel(3,"How do you insert COMMENTS in Java code?","//This is a comment","#This is a comment",1);
		Questionmodel q4=new Questionmodel(4,"Which data type is used to create a variable that should store text in Java?","string","String",2);
		Questionmodel q5=new Questionmodel(5,"Java is a ","Programming Language","Structural Language",1);
		Questionmodel q6=new Questionmodel(6,"Which operator is used to add together two values?","*","+",2);
		Questionmodel q7=new Questionmodel(7,"Which method can be used to return a string in upper case letters?","uppercase()","toUpperCase()",2);
		Questionmodel q8=new Questionmodel(8,"Which operator can be used to compare two values?","==","<>",1);
		Questionmodel q9=new Questionmodel(9,"To declare an array in Java, define the variable type with:","[]","{}",1);
		Questionmodel q10=new Questionmodel(10,"Array indexes start with:","1","0",2);
		service.storeQuestions(q1);
		service.storeQuestions(q2);
		service.storeQuestions(q3);
		service.storeQuestions(q4);
		service.storeQuestions(q5);
		service.storeQuestions(q6);
		service.storeQuestions(q7);
		service.storeQuestions(q8);
		service.storeQuestions(q9);
		service.storeQuestions(q10);
		
		return service.getQuestionmodels();
	}
	
	@PostMapping("/evaluate")
	public int scoreAnswers(@RequestBody List<Questionmodel> questionmodels) {
		int v=service.getResults(questionmodels);
		Attempt a=new Attempt(v);
		service.storeAttempts(a);
		return v;
	}
	
	@GetMapping("/attempts")
	public  List<Attempt> getAttempts(){
		return  service.getAttempts();
	}
	

}
