package com.shiv.hackerrank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecureMessages {

	public static void main(String[] args) {
		String name = "kate wins?let";
		Pattern pattern = Pattern.compile("[^a-zA-Z0-9 ]");
		Matcher matcher = pattern.matcher(name);
		if (matcher.find()) {
			try {
				throw new IllegalArgumentException("java.lang.IllegalArgumentException: Try again with valid name");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} else {
			System.out.println(new StringBuilder(name).reverse());
		}
	}
}
