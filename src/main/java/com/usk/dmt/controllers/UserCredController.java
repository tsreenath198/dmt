package com.usk.dmt.controllers;

import com.usk.dmt.constants.URIConstants;
import com.usk.dmt.entities.Technology;
import com.usk.dmt.entities.UserCred;
import com.usk.dmt.repository.TechnologyRepository;
import com.usk.dmt.repository.UserCredRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(URIConstants.USER)
public class UserCredController extends BaseController<UserCred> {
    public UserCredController(UserCredRepository repository) {
        super(repository);
    }
}
