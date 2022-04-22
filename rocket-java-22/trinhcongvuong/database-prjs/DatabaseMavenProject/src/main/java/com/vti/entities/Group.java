package com.vti.entities;

import java.time.LocalDateTime;

public class Group {

	private static long currentId = 0;

	private long groupId;

	private String groupName;

	private Account creator;

	private LocalDateTime createDate;

	public Group() {
		setGroupId();
	}

	public Group(String groupName, Account creator) {
		setGroupId();
		this.groupName = groupName;
		this.creator = creator;
	}

	public long getGroupId() {
		return groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
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

	private void setGroupId() {
		this.groupId = ++currentId;
	}
}
