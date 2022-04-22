package com.vti.entities;

import java.time.LocalDateTime;

public class GroupAccount {

	private Group group;

	private Account account;

	private LocalDateTime joinDate;

	public GroupAccount(Group group, Account account) {
		this.group = group;
		this.account = account;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public LocalDateTime getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDateTime joinDate) {
		this.joinDate = joinDate;
	}

}
