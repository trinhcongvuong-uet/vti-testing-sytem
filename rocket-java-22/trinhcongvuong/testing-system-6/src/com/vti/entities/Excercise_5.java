package com.vti.entities;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Excercise_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		question_1(scanner);
//		question_2(scanner);
//		question_3(scanner);
//		question_4(scanner);
		question_5(scanner);

	}

	private static void question_1(Scanner scanner) {
		int[] intValues = new int[3];
		System.out.println("Enter 3 integer number:");
		for (int i = 0; i < intValues.length; i++) {
			boolean isEnterRepeat = false;
			do {
				isEnterRepeat = false;
				System.out.printf("Enter integer number %s:", (i + 1));
				try {
					intValues[i] = Integer.valueOf(scanner.nextLine()).intValue();
				} catch (Exception e) {
					System.out.println("Please enter an integer number!");
					isEnterRepeat = true;
				}
			} while (isEnterRepeat);
		}

		System.out.println("Array of integer numbers just entered:");
		for (int i = 0; i < intValues.length; i++) {
			System.out.printf("Integer %s:%s%n", (i + 1), intValues[i]);
		}

	}

	private static void question_2(Scanner scanner) {
		double[] intValues = new double[2];
		System.out.println("Enter 2 real number:");
		for (int i = 0; i < intValues.length; i++) {
			boolean isEnterRepeat = false;
			do {
				isEnterRepeat = false;
				System.out.printf("Enter real number %s:", (i + 1));
				try {
					intValues[i] = Double.valueOf(scanner.nextLine()).doubleValue();
				} catch (Exception e) {
					System.out.println("Please enter an real number!");
					isEnterRepeat = true;
				}
			} while (isEnterRepeat);
		}

		System.out.println("Array of real numbers just entered:");
		for (int i = 0; i < intValues.length; i++) {
			System.out.printf("Real number %s:%s%n", (i + 1), intValues[i]);
		}
	}

	private static void question_3(Scanner scanner) {
		System.out.println("Enter first name:");
		String firstname = scanner.nextLine();

		System.out.println("Enter last name:");
		String lastName = scanner.nextLine();

		System.out.println(String.join(" ", firstname, lastName));
	}

	private static void question_4(Scanner scanner) {
		LocalDate today = LocalDate.now();
		boolean isEnterRepeat = false;

		do {
			int yearOfBirthday = 0;
			do {
				isEnterRepeat = false;
				System.out.println("Enter year of birthday:");
				try {
					yearOfBirthday = Integer.valueOf(scanner.nextLine()).intValue();

					if (yearOfBirthday < 1900 || yearOfBirthday > today.getYear()) {
						System.out.println("Year of birthday is 1900 ~ " + today.getYear());
						isEnterRepeat = true;
					}
				} catch (Exception e) {
					System.out.println("Please enter an integer number!");
					isEnterRepeat = true;
				}
			} while (isEnterRepeat);

			int monthOfBirthday = 0;
			do {
				isEnterRepeat = false;
				System.out.println("Enter month of birthday:");
				try {
					monthOfBirthday = Integer.valueOf(scanner.nextLine()).intValue();
					if (monthOfBirthday < 1 || monthOfBirthday > 12) {
						System.out.println("Month of birthday is 1 ~ 12");
						isEnterRepeat = true;
					} else if (yearOfBirthday == today.getYear() && monthOfBirthday > today.getMonthValue()) {
						System.out.printf("Birthday must be less than %s/%s%n", today.getYear(), today.getMonthValue());
						isEnterRepeat = true;
					}
				} catch (Exception e) {
					System.out.println("Please enter an integer number!");
					isEnterRepeat = true;
				}
			} while (isEnterRepeat);

			int dayOfBirthday = 0;
			do {
				isEnterRepeat = false;
				System.out.println("Enter month of birthday:");
				try {
					dayOfBirthday = Integer.valueOf(scanner.nextLine()).intValue();
					if (dayOfBirthday < 1 || dayOfBirthday > 31) {
						System.out.println("Day of birthday is 1 ~ 31");
						isEnterRepeat = true;
					} else if (yearOfBirthday == today.getYear() && monthOfBirthday == today.getMonthValue()
							&& dayOfBirthday > today.getDayOfMonth()) {
						System.out.printf("Birthday must be less than %s/%s/%s%n", today.getYear(),
								today.getMonthValue(), today.getDayOfMonth());
						isEnterRepeat = true;
					}
				} catch (NumberFormatException e) {
					System.out.println("Please enter an integer number!");
					isEnterRepeat = true;
				}
			} while (isEnterRepeat);

			try {
				LocalDate birthday = LocalDate.of(yearOfBirthday, monthOfBirthday, dayOfBirthday);
				System.out.println(birthday);
			} catch (DateTimeException e) {
				System.out.println(e.getMessage());
				isEnterRepeat = true;
			}
		} while (isEnterRepeat);
	}

	private static void question_5(Scanner scanner) {
		System.out.println("Enter account info:");

		Account account = new Account();
		boolean isEnterRepeat = false;
		do {
			isEnterRepeat = false;
			System.out.print("Enter account id:");
			try {
				account.accountId = Long.valueOf(scanner.nextLine()).longValue();
			} catch (Exception e) {
				System.out.println("Please enter an long number!");
				isEnterRepeat = true;
			}
		} while (isEnterRepeat);

		System.out.print("Enter email:");
		account.email = scanner.nextLine();

		System.out.print("Enter user name:");
		account.userName = scanner.nextLine();

		System.out.print("Enter full name:");
		account.fullName = scanner.nextLine();

		account.department = question_6(scanner);

		System.out.println("Enter position info:");
		Position position = new Position();
		do {
			isEnterRepeat = false;
			System.out.print("Enter position id:");
			try {
				position.positionId = Long.valueOf(scanner.nextLine()).longValue();
			} catch (Exception e) {
				System.out.println("Please enter an long number!");
				isEnterRepeat = true;
			}
		} while (isEnterRepeat);

		int positionName = 0;
		do {
			isEnterRepeat = false;
			System.out.println("\t1.Dev");
			System.out.println("\t2.Test");
			System.out.println("\t3.Scrum");
			System.out.println("\t4.Master");
			System.out.println("\t5.PM");
			System.out.print("Enter position name:");
			try {
				positionName = Integer.valueOf(scanner.nextLine()).intValue();
				switch (positionName) {
				case 1:
					position.positionName = PositionNameEnum.DEV;
					break;
				case 2:
					position.positionName = PositionNameEnum.TEST;
					break;
				case 3:
					position.positionName = PositionNameEnum.SCRUM;
					break;
				case 4:
					position.positionName = PositionNameEnum.MASTER;
					break;
				case 5:
					position.positionName = PositionNameEnum.PM;
					break;
				default:
					System.out.println("Musst be enter in {1,2,3,4,5}!");
					isEnterRepeat = true;
					break;
				}

			} catch (Exception e) {
				System.out.println("Must be enter in {1,2,3,4,5}!");
				isEnterRepeat = true;
			}
		} while (isEnterRepeat);

		account.position = position;

		account.createDate = LocalDateTime.now();

		// print
	}

	private static Department question_6(Scanner scanner) {
		System.out.println("Enter department info:");
		Department department = new Department();
		boolean isEnterRepeat = false;
		do {
			System.out.print("Enter department id:");
			try {
				department.departmentId = Long.valueOf(scanner.nextLine()).longValue();
				isEnterRepeat = false;
			} catch (Exception e) {
				System.out.println("Please enter an long number!");
				isEnterRepeat = true;
			}
		} while (isEnterRepeat);

		System.out.print("Enter department name:");
		department.departmentName = scanner.nextLine();

		return department;
	}

	private static void question_7(Scanner scanner) {
		boolean isEnterRepeat = false;
		long evenValue = 0L;
		do {
			try {
				evenValue = Long.valueOf(scanner.nextLine()).longValue();
				if (evenValue % 2 != 0) {
					System.out.println("Please enter an even number!");
					isEnterRepeat = true;
				}
				isEnterRepeat = false;
			} catch (Exception e) {
				System.out.println("Please enter an even number!");
				isEnterRepeat = true;
			}
		} while (isEnterRepeat);

		System.out.println("Even number: " + evenValue);
	}

	private static void question_8(Scanner scanner) {
		System.out.println("1.Create account.");
		System.out.println("2.Create department.");
		System.out.print("Enter choice:");

		int choice = 0;
		boolean isEnterRepeat = false;
		do {
			try {
				choice = Integer.valueOf(scanner.nextLine()).intValue();
				switch (choice) {
				case 1:
					question_5(scanner);
					isEnterRepeat = false;
					break;

				case 2:
					question_6(scanner);
					isEnterRepeat = false;

				default:
					System.out.println("Enter repeat");
					isEnterRepeat = true;
					break;
				}
			} catch (Exception e) {
				System.out.println("Please enter an integer number!");
				isEnterRepeat = true;
			}
		} while (isEnterRepeat);
	}

	private static GroupAccount question_9(Account[] accounts, Group[] groups, Scanner scanner) {
		System.out.println("List account");
		for (int i = 0; i < accounts.length; i++) {
			System.out.printf("%s.%n", accounts[i].userName);
		}

		System.out.print("Enter user name:");
		String userName = scanner.nextLine();

		System.out.println("List group");
		for (int i = 0; i < groups.length; i++) {
			System.out.printf("%s.%n", groups[i].groupName);
		}
		System.out.print("Enter group name:");
		String groupName = scanner.nextLine();

		GroupAccount groupAccount = new GroupAccount();
		for (Account account : accounts) {
			if (account.userName.equals(userName)) {
				groupAccount.account = account;
			}
		}

		for (Group group : groups) {
			if (group.groupName.equals(groupName)) {
				groupAccount.group = group;
				break;
			}
		}
		
		return groupAccount;
	}
}
