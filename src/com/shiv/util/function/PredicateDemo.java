package com.shiv.util.function;

import java.util.ArrayList;
import java.util.List;

import com.shiv.model.Student;

public class PredicateDemo {

	public static void main(String[] args) {
		Student student1 = new Student(1, "shiv", 23, 98,"shiv@gmail.com");
		Student student2 = new Student(2, "kumar", 32, 91,"kumar@gmail.com");
		Student student3 = new Student(3, "tony", 26, 88,"tony@gmail.com");
		Student student4 = new Student(4, "dummy", 27, 75,"dummy@gmail.com");
		
		
		List<Student> list = new ArrayList<>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		
		list.forEach(student -> System.out.println(student));
		
	}
}
