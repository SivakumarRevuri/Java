package com;

/* * enum Vs Inheritance
 * Every enum in java Child class of java.lang.Enum. Hence we can't extend any other enum.
 * 
 * 1. enum can't extend other enums.
 * 2. every enum always final implicitly. Hence we can't create child enum.
 * Hence we can't use extends keyword for enums.
 * 
 * 				but
 * enum can Implement any number of Interfaces Simultaneously.
 * 
 * 
 * java.lang.Enum: 
 * 1. Every enum in java Child class of java.lang.Enum. Hence this class acts as base class for all Java enums 
 * 2. it is the direct child class for all java enums
 * 3. It implements Serializable and Comparable interfaces.
 * 4. It is abstract class.
 * 
 * 
 * methods of enum: 
 * 
 * 1. values() => to list out all values present in enum and it returns a array. enum keyword implicitly provides this method.
 * ex: Month m[] = Month.values();
		for (Month month : m) {
			System.out.println(month);
		}
 * 2. ordinal() =>  to find the ordinal value of enum constant will use this method.
 * 		this method available in java.lang.Enum class.
 * 
 * */
interface TestInterface{
	void test();
}

/*Speciality of java Enum: 
 * 1. 
 * 
 * */

enum dummy  implements TestInterface{
	;

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
	
}

public class EnumVsInheritance {

	public static void main(String[] k) {
		Month m[] = Month.values();
		for (Month month : m) {
			System.out.println(month+" ordinal value is: "+month.ordinal());
		}
	}
}
