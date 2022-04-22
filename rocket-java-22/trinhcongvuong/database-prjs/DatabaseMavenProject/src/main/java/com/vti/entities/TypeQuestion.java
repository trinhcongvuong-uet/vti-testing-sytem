package com.vti.entities;

public class TypeQuestion {

	private static long currentId = 0;

	private long typeId;

	private TypeQuestEnum typeName;

	public TypeQuestion() {
		setTypeId();
	}

	public TypeQuestion(TypeQuestEnum typeName) {
		setTypeId();
		this.typeName = typeName;
	}

	public long getTypeId() {
		return typeId;
	}

	public TypeQuestEnum getTypeName() {
		return typeName;
	}

	public void setTypeName(TypeQuestEnum typeName) {
		this.typeName = typeName;
	}

	private void setTypeId() {
		this.typeId = ++currentId;
	}

}
