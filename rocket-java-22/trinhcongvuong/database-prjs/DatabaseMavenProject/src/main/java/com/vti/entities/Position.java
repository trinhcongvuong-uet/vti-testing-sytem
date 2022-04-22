package com.vti.entities;

public class Position {

	private static long currentId = 0;

	private long positionId;

	private PositionNameEnum positionName;

	public Position() {
		setPositionId();
	}

	public Position(PositionNameEnum positionName) {
		setPositionId();
		this.positionName = positionName;
	}

	public long getPositionId() {
		return positionId;
	}

	public PositionNameEnum getPositionName() {
		return positionName;
	}

	public void setPositionName(PositionNameEnum positionName) {
		this.positionName = positionName;
	}

	private void setPositionId() {
		this.positionId = +currentId;
	}
}
