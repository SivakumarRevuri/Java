package com.shiv.Enum;

/*enum Vs constructors 
 * 
 * 1. we can't create enum object explicitly by new operator. {Month m = new Month();}X
 * 2. To achieve this pass Month as datatype in enum.
 * */
public class EnumVsConstructors {

	public static void main(String[] args) {
		// creating object of Month enum.
		System.out.println(Month.Month);
		System.out.println("Hello!!!!");
		//to invoke parameterized
		Month month = Month.JULY;
		System.out.println(month);
	}
}
