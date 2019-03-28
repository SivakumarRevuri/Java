package com;

public class MainClass {

	/*
	 * enum Vs switch
	 * 
	 * from JAVA1.5 onwards we can pass enum as argument type to switch statement.
	 * When you try to pass non-enum datatype to switch case it will give error as
	 * "Unqualified enumeration constant name required "
	 */

	enum Test {

	}

	public static void main(String[] args) {
		Month month = Month.APRIL;
		System.out.println(month);

		// passing enum type to switch statement.
		switch (month) {
		case JAN:
			System.out.println("I am " + Month.JAN);
			break;
		case FEB:
			System.out.println("I am " + Month.FEB);
			break;
		case APRIL:
			System.out.println("I am " + Month.APRIL);
			break;
		default:
			System.out.println("Month is not available in Calender");
		}
	}
}
