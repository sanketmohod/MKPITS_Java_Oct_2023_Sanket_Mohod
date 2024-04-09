package com.mkpits.mvc;

import java.util.ArrayList;
import java.util.List;

public class StudentUtil {
public static List<Student> getStudents(){
	// create an empty array list
	List<Student> students = new ArrayList<Student>();
	// ADD DATA
	students.add(new Student("karan", "mohod", "karanmohod17@gmail.com"));
	students.add(new Student("karan", "mohod", "karanmohod17@gmail.com"));
	students.add(new Student("karan", "mohod", "karanmohod17@gmail.com"));
	students.add(new Student("karan", "mohod", "karanmohod17@gmail.com"));
    // return list
	return students;
}
}
