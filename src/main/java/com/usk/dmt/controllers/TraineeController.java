package com.usk.dmt.controllers;

import com.usk.dmt.constants.URIConstants;
import com.usk.dmt.entities.Trainee;
import com.usk.dmt.entities.Trainer;
import com.usk.dmt.repository.TraineeRepository;
import com.usk.dmt.repository.TrainerRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(URIConstants.TRAINEE)
public class TraineeController extends BaseController<Trainee> {
    public TraineeController(TraineeRepository repository) {
        super(repository);
    }
}