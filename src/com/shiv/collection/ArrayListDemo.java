package com.shiv.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(43);
		arrayList.add(12);
		arrayList.add(34);
		arrayList.add(43);
		// array list allows duplicates and maintains insertion order
		System.out.println(arrayList); // [43, 12, 34, 43]

		arrayList.add(0, 99);
		arrayList.set(2, 65);
		System.out.println(arrayList); // [99, 43, 65, 34, 43]

		System.out.println(arrayList.contains(100)); // false
		arrayList.remove(1);
		System.out.println(arrayList); // [99, 65, 34, 43]
	}
}
