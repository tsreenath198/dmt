package com.usk.dmt.controllers;

import com.usk.dmt.constants.URIConstants;
import com.usk.dmt.entities.Technology;
import com.usk.dmt.repository.TechnologyRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(URIConstants.TECHNOLOGY)
public class TechnologyController extends BaseController<Technology> {
    public TechnologyController(TechnologyRepository repository) {
        super(repository);
    }
}
