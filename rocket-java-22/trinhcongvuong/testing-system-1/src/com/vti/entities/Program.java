package com.vti.entities;

public class Program {

	public static void main(String[] args) {
		// Question 1: tao cac class nhu da tao tai package com.vti.entities

		// Question 2
		// Khoi tao doi tuong chung ta sung sung toan tu "new"
		Account account1 = new Account();
		account1.accountId = 1L;
		account1.userName = "account1";

		Account account2 = new Account();
		account2.accountId = 2L;
		account2.userName = "account2";

		Account account3 = new Account();
		account3.accountId = 3L;
		account3.userName = "account3";

		Answer answer1 = new Answer();
		answer1.answerId = 1L;
		answer1.content = "answer 1";

		Answer answer2 = new Answer();
		answer2.answerId = 2L;
		answer2.content = "answer 2";

		Answer answer3 = new Answer();
		answer3.answerId = 3L;
		answer3.content = "answer 3";

		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.categoryId = 1L;
		categoryQuestion1.categoryName = "Category Question 1";

		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.categoryId = 2L;
		categoryQuestion2.categoryName = "Category Question 2";

		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.categoryId = 3L;
		categoryQuestion3.categoryName = "Category Question 3";

		Department department1 = new Department();
		department1.departmentId = 1L;
		department1.departmentName = "Department 1";

		Department department2 = new Department();
		department2.departmentId = 2L;
		department2.departmentName = "Department 2";

		Department department3 = new Department();
		department3.departmentId = 3L;
		department3.departmentName = "Department 3";

		Exam exam1 = new Exam();
		exam1.examId = 1L;
		exam1.title = "Exam 1";

		Exam exam2 = new Exam();
		exam2.examId = 2L;
		exam2.title = "Exam 2";

		Exam exam3 = new Exam();
		exam3.examId = 3L;
		exam3.title = "Exam 3";

		Question question1 = new Question();
		question1.questionId = 1L;
		question1.content = "Question 1";

		Question question2 = new Question();
		question2.questionId = 2L;
		question2.content = "Question 2";

		Question question3 = new Question();
		question3.questionId = 3L;
		question3.content = "Question 3";

		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.typeId = 1L;
		typeQuestion1.typeName = TypeQuestEnum.ESSAY;

		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.typeId = 2L;
		typeQuestion2.typeName = TypeQuestEnum.MULTOPLECHOICE;

		TypeQuestion typeQuestion3 = new TypeQuestion();
		typeQuestion3.typeId = 3L;
		typeQuestion3.typeName = TypeQuestEnum.ESSAY;

		ExamQuestion examQuestion1 = new ExamQuestion();
		examQuestion1.exam = exam1;
		examQuestion1.question = question1;

		ExamQuestion examQuestion2 = new ExamQuestion();
		examQuestion2.exam = exam2;
		examQuestion2.question = question2;

		ExamQuestion examQuestion3 = new ExamQuestion();
		examQuestion3.exam = exam3;
		examQuestion3.question = question3;

		Group group1 = new Group();
		group1.groupId = 1L;
		group1.groupName = "Group 1";

		Group group2 = new Group();
		group2.groupId = 2L;
		group2.groupName = "Group 2";

		Group group3 = new Group();
		group3.groupId = 3L;
		group3.groupName = "Group 3";

		GroupAccount groupAccount1 = new GroupAccount();
		groupAccount1.account = account1;
		groupAccount1.group = group1;

		GroupAccount groupAccount2 = new GroupAccount();
		groupAccount2.account = account2;
		groupAccount2.group = group2;

		GroupAccount groupAccount3 = new GroupAccount();
		groupAccount3.account = account3;
		groupAccount3.group = group3;

		Position position1 = new Position();
		position1.positionId = 1L;
		position1.positionName = PositionNameEnum.DEV;

		Position position2 = new Position();
		position2.positionId = 2L;
		position2.positionName = PositionNameEnum.MASTER;

		Position position3 = new Position();
		position3.positionId = 3L;
		position3.positionName = PositionNameEnum.PM;

		// Question 3
		account1.print();
		System.out.println();

		answer1.print();
		System.out.println();

		categoryQuestion1.print();
		System.out.println();

		department1.print();
		System.out.println();

		exam1.print();
		System.out.println();

		examQuestion1.print();
		System.out.println();

		group1.print();
		System.out.println();

		groupAccount1.print();
		System.out.println();

		position1.print();
		System.out.println();

		question1.print();
		System.out.println();

		typeQuestion1.print();
		System.out.println();

	}

}
