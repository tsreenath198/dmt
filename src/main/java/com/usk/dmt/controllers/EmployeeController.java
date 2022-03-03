package com.usk.dmt.controllers;

import com.usk.dmt.constants.URIConstants;
import com.usk.dmt.entities.Employee;
import com.usk.dmt.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(URIConstants.EMPLOYEE)
public class EmployeeController extends BaseController<Employee> {
    public EmployeeController(EmployeeRepository repository) {
        super(repository);
    }
}