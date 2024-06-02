package com.example.demo.controller;

import com.example.demo.dto.AddressDto;
import com.example.demo.dto.EmployeeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    @RequestMapping("/object")
    public ResponseEntity<Object> getEmployeeDetails() {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setName("Karan");
        employeeDto.setDepartment("IT");
        employeeDto.setDesignation("Software Developer");

        List<AddressDto> addressDtoList = new ArrayList<>();

        AddressDto addressDto1 = new AddressDto();
        addressDto1.setAddressType('P');
        addressDto1.setStreet("Badnera");
        addressDto1.setCity("Amravati");
        addressDto1.setState("Maharashtra");
        addressDto1.setCountry("India");
        addressDtoList.add(addressDto1);

        AddressDto addressDto2 = new AddressDto();
        addressDto2.setAddressType('C');
        addressDto2.setStreet("Ravi Nagar");
        addressDto2.setCity("Akola");
        addressDto2.setState("Maharashtra");
        addressDto2.setCountry("India");
        addressDtoList.add(addressDto2);

        employeeDto.setAddress(addressDtoList);

        return ResponseEntity.ok(employeeDto);

    }
}