package com.example.demo.service;


import com.example.demo.dto.AddressDto;
import com.example.demo.dto.EmployeeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnployeeService {

    public EmployeeDto getAllEmployees(){
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setName("Rohit");
        employeeDto.setDepartment("BCCI");
        employeeDto.setDesignation("Cricketer");

        List<AddressDto> addressDto = new ArrayList<>();
        AddressDto addressDto1 = new AddressDto();
        addressDto1.setAddressType('P');
        addressDto1.setStreet("Badnera");
        addressDto1.setCity("Amravati");
        addressDto1.setState("Maharashtra");
        addressDto1.setCountry("India");

        AddressDto addressDto2 = new AddressDto();
        addressDto2.setAddressType('C');
        addressDto2.setStreet("Ravi Nagar");
        addressDto2.setCity("Akola");
        addressDto2.setState("Maharashtra");
        addressDto2.setCountry("India");

        addressDto.add(addressDto1);
        addressDto.add(addressDto2);
        employeeDto.setAddress(addressDto);
        return employeeDto;
    }
}
