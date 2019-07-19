package com.shiv.programs;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int number = scanner.nextInt();
		StringBuilder builder = new StringBuilder();
		while(number > 0) {
			builder.append(number %10);
			number /= 10;
		}
		System.out.println(Integer.parseInt(new String(builder)));
		scanner.close();
	}
}
