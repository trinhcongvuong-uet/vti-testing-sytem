package com.vti.entities;

public class CategoryQuestion {

	private static long currentId = 0;

	private long categoryId;

	private String categoryName;

	public CategoryQuestion() {
		setCategoryId();
	}

	public CategoryQuestion(String categoryName) {
		setCategoryId();
		this.categoryName = categoryName;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	private void setCategoryId() {
		this.categoryId = ++currentId;
	}

}
