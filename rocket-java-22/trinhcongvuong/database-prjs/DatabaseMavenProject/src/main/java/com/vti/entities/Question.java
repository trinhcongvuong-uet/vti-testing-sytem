package com.vti.entities;

import java.time.LocalDateTime;

public class Question {

	private static long currentId = 0;

	private long questionId;

	private String content;

	private CategoryQuestion category;

	private TypeQuestion type;

	private Account creator;

	private LocalDateTime createDate;

	public Question() {
		setQuestionId();
	}

	public Question(String content, CategoryQuestion category, TypeQuestion type, Account creator) {
		setQuestionId();
		this.content = content;
		this.category = category;
		this.type = type;
		this.creator = creator;
	}

	public long getQuestionId() {
		return questionId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public CategoryQuestion getCategory() {
		return category;
	}

	public void setCategory(CategoryQuestion category) {
		this.category = category;
	}

	public TypeQuestion getType() {
		return type;
	}

	public void setType(TypeQuestion type) {
		this.type = type;
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

	private void setQuestionId() {
		this.questionId = ++currentId;
	}

}
