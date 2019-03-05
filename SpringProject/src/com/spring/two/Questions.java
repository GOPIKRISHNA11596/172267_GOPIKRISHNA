package com.spring.two;

import java.util.List;

public class Questions {
	private int questionId;
	private String question;
	private List<String> answers;
	
	public Questions() {
		super();
	}

	public Questions(int questionId, String question, List<String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
	public void display() {
		System.out.println("Question:" +getQuestion());
		System.out.println("Answer:" +getAnswers());
	}
}
