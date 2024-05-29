package com.example.demo.controller;

import com.example.demo.dto.AddressDto;
import com.example.demo.dto.EmployeeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @RequestMapping("/object")
    public ResponseEntity<Object> getEmployeeDetails() {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setName("Karan");
        employeeDto.setDepartment("IT");
        employeeDto.setDesignation("Software Developer");

        AddressDto addressDto = new AddressDto();
        addressDto.setAddressType('P');
        addressDto.setStreet("Badnera");
        addressDto.setCity("Amravati");
        addressDto.setState("Maharashtra");
        addressDto.setCountry("India");

        AddressDto addressDto1 = new AddressDto();
        addressDto1.setAddressType('C');
        addressDto1.setStreet("Ravi Nager");
        addressDto1.setCity("Akola");
        addressDto1.setState("Maharashtra");
        addressDto1.setCountry("India");

        employeeDto.setAddress(addressDto);
        return ResponseEntity.ok(employeeDto);

    }
}