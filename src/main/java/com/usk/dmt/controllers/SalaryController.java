package com.usk.dmt.controllers;

import com.usk.dmt.constants.URIConstants;
import com.usk.dmt.entities.Invoice;
import com.usk.dmt.entities.Salary;
import com.usk.dmt.repository.InvoiceRepository;
import com.usk.dmt.repository.SalaryRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(URIConstants.SALARY)
public class SalaryController extends BaseController<Salary> {
    public SalaryController(SalaryRepository repository) {
        super(repository);
    }
}
