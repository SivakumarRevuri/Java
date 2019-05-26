package com.shiv.Enum;

/*
 * A group of named constants called as enum
 * purpose: To define custom datatypes (enumarated Datatypes)
 * 
 * NOTE: Here semicolon is optional.
 * 
 *1.  Every enum internally created as class
 *2. variables are by default public static final
 *
 *enums can be created outside of the class && inside of the class as well. But we can't declare inside method
 *=> if you tried to create inside methods Compiler error as "enum types must not be local"
 *
 *if you declare enum outside allowed access modifiers are public, default, strictfp
 *enum with in the class => public, default, strictfp, private, protected, static
 *  */

/* 
 * Usage: Month month = Month.APRIL;
 * super(month);
 * */

public enum Month {

	JAN, FEB, MARCH,APRIL,MAY,JUNE,JULY(7),Month;
	int id;
	
	// enum constructor and it will be created at the time of class loading due to it is static.
	Month(int id) {
		this.id = id;
		System.out.println("I am Month enum parameterized Constructor");
	}
	Month() {
		System.out.println("I am month enum zero parameterized constructor");
	}
	/*
	 * Above constants internally implemented as 
	 * class Month{
		public static final Month  JAN = new Month();
		public static final Month  FEB = new Month();
		public static final Month  MARCH = new Month();
		public static final Month  APRIL = new Month();
		public static final Month  MAY = new Month();
	}
	 * */
	
	/* 1. In enum we can main method. But make sure list of constants should declare in the first line. 
	 * 2. First line should contain constants or at least semicolon
	 * 3. only methods or constructor not valid in first line.
	 * 4. Empty enum is valid.
	 * 5. abstract methods are not valid.
	 * */
	public static void main(String[] args) {
		System.out.println("enum main method");
	}
}


 