package com.mkpits.collection;

import java.util.ArrayList;

public class EmployeeMainClass {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("shri", 150000.00));
		list.add(new Employee("karan", 25000.00));
		list.add(new Employee("rohit", 50000.00));
		
		// Now creating one more list
		ArrayList<Employee> list1 = new ArrayList<Employee>();
		list1.add(new Employee("Raj", 20000.00));
		list1.add(new Employee("Ashik", 30000.00));
		list1.add(new Employee("Pranay", 22000.00));
        // .addAll method
        list.addAll(list1);
        System.out.println("After addAll() : ");
        for (Employee emp : list) {
			System.out.println(emp);
		}
        
        // .removeAll method
//        list.removeAll(list1);
//        System.out.println("After removeAll() : ");
//        for (Employee employee : list) {
//			System.out.println(employee);
//		}
        
        // .retainAll method
        list.retainAll(list1);
        System.out.println("After retainAll() : ");
        for (Employee employee : list) {
			System.out.println(employee);
		}
	}

}
