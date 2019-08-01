package com.shiv.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(53);
		list.add(68);
		list.add(27);
		list.add(32);
		list.add(47);
		list.add(27);
		list.add(72);

		List<Integer> failedStudents = list.stream().filter(marks -> marks < 35).collect(Collectors.toList());

		failedStudents.stream().forEach(System.out::println);
		System.out.println("============================");
		// adding grace marks to failed students
		List<Integer> updatedStudentList = failedStudents.stream().map(m -> m+=5).collect(Collectors.toList());
		updatedStudentList.stream().forEach(System.out::println);
	}
}
