package com.quiz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Attempt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private int score;
	public Attempt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Attempt(int score) {
		super();
		this.score = score;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	

}
