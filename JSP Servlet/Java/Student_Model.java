package com.mkpits.jdbc1;

public class Student_Model {

	private int id;
	private String fName;
	private String lName;
	private String email;

	public Student_Model() {

	}

	public Student_Model(String fName, String lName, String email) {

		this.fName = fName;
		this.lName = lName;
		this.email = email;
	}

	public Student_Model(int id, String fName, String lName, String email) {

		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fName=" + fName + ", lName=" + lName + ", email=" + email + "]";
	}

}
