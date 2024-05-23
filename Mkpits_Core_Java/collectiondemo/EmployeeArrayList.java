package com.mkpits.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeArrayList {

	public static void main(String[] args) {

		ArrayList<Employees> list = new ArrayList<Employees>();
		list.add(new Employees(101, "karan"));
		list.add(new Employees(102, "pranay"));
		list.add(new Employees(103, "vinay"));
//		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
//			Employees employees = (Employees) iterator.next();
//			System.out.println(employees);
//		}
		System.out.println("Using for each loop : ");
		for (Employees employees : list) {
			System.out.println(employees);
		}
	}

}
