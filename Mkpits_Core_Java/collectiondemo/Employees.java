package com.mkpits.collectiondemo;

public class Employees {

	// bean classs/ model class - it contains methods, variables, and constructor
	int id;
	String name;
	public Employees() {
		super();
	}
	public Employees(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
