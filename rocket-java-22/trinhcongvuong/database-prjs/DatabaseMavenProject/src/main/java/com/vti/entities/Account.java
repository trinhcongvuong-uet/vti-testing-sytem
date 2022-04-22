package com.vti.entities;

import java.time.LocalDateTime;

public class Account {

	private static long currentId = 0;

	private long accountId;

	private String email;

	private String userName;

	private String fullName;

	private Department department;

	private Position position;

	private LocalDateTime createDate;

	public Account() {
		setAccountId();
	}

	public Account(String email, String userName, String fullName) {
		setAccountId();
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
	}

	public Account(String email, String fullName, Department department, Position position) {
		setAccountId();
		this.email = email;
		this.fullName = fullName;
		this.department = department;
		this.position = position;
	}

	public Account(long accountId) {
		this.accountId = accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public long getAccountId() {
		return accountId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	private void setAccountId() {
		this.accountId = ++currentId;
	}
}
