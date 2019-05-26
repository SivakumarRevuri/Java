package com.shiv.Enum;

/*enum vs import
 * 
 * normal import: 
 * Math.sqrt(4)
 * static import: 
 * import static java.lang.Math.sqrt; then i can directly use sqrt method.
 * sqrt(4);
 * */


public class Enum_Methods {

	public static void main(String[] args) {
		Month.JAN.equals(Month.APRIL);
		System.out.println(Month.FEB == Month.APRIL);
		System.out.println(Month.FEB.hashCode() == Month.APRIL.hashCode());
	}
}
