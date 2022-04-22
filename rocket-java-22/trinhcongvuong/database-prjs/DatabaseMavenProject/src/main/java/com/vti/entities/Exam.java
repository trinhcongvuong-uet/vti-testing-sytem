package com.vti.entities;

import java.time.LocalDateTime;

public class Exam {

	private static long currentId = 0;

	private long examId;

	private int code;

	private String title;

	private CategoryQuestion categoryQuestion;

	private int duration;

	private Account creator;

	private LocalDateTime createDate;

	public Exam() {
		setExamId();
	}

	public Exam(int code, String title, CategoryQuestion categoryQuestion, int duration, Account creator) {
		setExamId();
		this.code = code;
		this.title = title;
		this.categoryQuestion = categoryQuestion;
		this.duration = duration;
		this.creator = creator;
	}

	public long getExamId() {
		return examId;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CategoryQuestion getCategoryQuestion() {
		return categoryQuestion;
	}

	public void setCategoryQuestion(CategoryQuestion categoryQuestion) {
		this.categoryQuestion = categoryQuestion;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Account getCreator() {
		return creator;
	}

	public void setCreator(Account creator) {
		this.creator = creator;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	private void setExamId() {
		this.examId = ++currentId;
	}

}
