package com.shiv.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CollectionFrequency {
	
	protected static List<Integer> list = new ArrayList<>(
				Arrays.asList(1,3,5,2,1,3));

	public static void main(String[] args) {
		System.out.println(list);
		CollectionFrequency frequency = new CollectionFrequency();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int key = scanner.nextInt();
		int noOfTimes = frequency.noOfOccurances(list, key);
		System.out.println(key+" is available in: "+noOfTimes);
		scanner.close();
	}
	
	private int noOfOccurances(Collection<Integer> collection, int key) {
		return Collections.frequency(collection, key);
	}
	
}
