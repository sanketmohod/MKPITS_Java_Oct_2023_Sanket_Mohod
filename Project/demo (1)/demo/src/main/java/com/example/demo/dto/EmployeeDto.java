package com.example.demo.dto;

public class EmployeeDto {

    private String name ;
    private  String department ;
    private  String designation ;
    private AddressDto address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeDto(String name, String department, String designation, AddressDto address) {
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }
}
