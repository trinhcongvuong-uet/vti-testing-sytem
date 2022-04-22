package com.vti.entities;

public class Answer {

	private static long currentId = 0;

	private long answerId;

	private String content;

	private Question question;

	private boolean isCorrect;

	public Answer() {
		setAnswerId();
	}

	public Answer(String content, Question question, boolean isCorrect) {
		setAnswerId();
		this.content = content;
		this.question = question;
		this.isCorrect = isCorrect;
	}

	public long getAnswerId() {
		return answerId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	private void setAnswerId() {
		this.answerId = ++currentId;
	}

}
