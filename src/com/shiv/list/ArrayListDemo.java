package com.shiv.list;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(43);
		arrayList.add(12);
		arrayList.add(34);
		arrayList.add(43);
		arrayList.add(75);
		// array list allows duplicates and maintains insertion order
		System.out.println(arrayList); // [43, 12, 34, 43, 75]

		arrayList.add(0, 99);
		arrayList.set(2, 65);
		System.out.println(arrayList); // [99, 43, 65, 34, 43, 75]

		System.out.println(arrayList.contains(100)); // false
		arrayList.remove(1);
		System.out.println(arrayList); // [99, 65, 34, 43, 75]
	}
}
