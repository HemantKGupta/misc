package com.hkg.test.switchstring;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("The day is:");
		printDayOld(2);
		System.out.println("The day is:");
		printDayNew("Tuesday");
	}

	public static void printDayOld(int dayOfWeek) {
		switch (dayOfWeek) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.err.println("Error!");
			break;
		}
	}

	public static void printDayNew(String dayOfWeek) {
		switch (dayOfWeek) {
		case "Sunday":
			System.out.println("Dimanche");
			break;
		case "Monday":
			System.out.println("Lundi");
			break;
		case "Tuesday":
			System.out.println("Mardi");
			break;
		case "Wednesday":
			System.out.println("Mercredi");
			break;
		case "Thursday":
			System.out.println("Jeudi");
			break;
		case "Friday":
			System.out.println("Vendredi");
			break;
		case "Saturday":
			System.out.println("Samedi");
			break;
		default:
			System.out.println("Error: '" + dayOfWeek
					+ "' is not a day of the week");
			break;
		}
	}
}
