package com.java.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortTest {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Vamsi", "Thota"));
		empList.add(new Employee("Neeraj", "Kumar"));

		SortTest sortTest = new SortTest();
		List<String> resList = sortTest.findEmployeesWithPrefix(empList);

	}

	public List<String> findEmployeesWithPrefix(List<Employee> empList) {
		List<String> empListWithT = empList.stream().filter(emp -> emp.getlName().indexOf("T") == 0)
				.map(emp -> emp.getlName()).collect(Collectors.toList());
		return empListWithT;
		
	}

}
