package com.shiv.programs;

public class IncrementOper {

	public static void main(String[] args) {
		int a = 6;
		int b = ++a;
		int c = b--;
		int d = a++ + --b - --c;
		System.out.println(a+" "+b+" "+c+" "+d);
	}
}
