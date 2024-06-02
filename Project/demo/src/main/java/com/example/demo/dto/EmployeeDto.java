package com.example.demo.dto;

import java.util.List;

public class EmployeeDto {

    private String name ;
    private  String department ;
    private  String designation ;
    private List<AddressDto> address;

    public void setAddress(List<AddressDto> address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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


}
