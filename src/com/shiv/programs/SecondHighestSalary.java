package com.shiv.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
	private String name;
	private double salary;

	public Employee() {
		super();
	}

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return this.name;
	}

	public double getSalary() {
		return this.salary;
	}

	@Override
	public int compareTo(Employee e) {
		if (this.salary == e.getSalary())
			return 0;
		else if (this.salary > e.getSalary())
			return +1;
		else
			return -1;
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {
		return this.name + ":  " + this.salary;
	}
}

public class SecondHighestSalary {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("shiv", 23453.43));
		list.add(new Employee("tony", 97365.34));
		list.add(new Employee("kumar", 65434.65));

		Collections.sort(list);
		System.out.println("Second highest: " + list.get(list.size() - 1));
	}
}
