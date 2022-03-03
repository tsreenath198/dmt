package com.usk.dmt.controllers;

import com.usk.dmt.constants.URIConstants;
import com.usk.dmt.entities.Interview;
import com.usk.dmt.entities.Trainee;
import com.usk.dmt.repository.InterviewRepository;
import com.usk.dmt.repository.TraineeRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(URIConstants.INTERVIEW)
public class InterviewController extends BaseController<Interview> {
    public InterviewController(InterviewRepository repository) {
        super(repository);
    }
}