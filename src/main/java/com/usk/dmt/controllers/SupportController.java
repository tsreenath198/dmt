package com.usk.dmt.controllers;

import com.usk.dmt.constants.URIConstants;
import com.usk.dmt.entities.Support;
import com.usk.dmt.repository.SupportRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(URIConstants.TECHNOLOGY)
public class SupportController extends BaseController<Support> {
    public SupportController(SupportRepository repository) {
        super(repository);
    }
}
