package com.usk.dmt.controllers;

import com.usk.dmt.constants.URIConstants;
import com.usk.dmt.entities.Technology;
import com.usk.dmt.entities.Trainer;
import com.usk.dmt.repository.TrainerRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(URIConstants.TRAINER)
public class TrainerController extends BaseController<Trainer> {
    public TrainerController(TrainerRepository repository) {
        super(repository);
    }
}