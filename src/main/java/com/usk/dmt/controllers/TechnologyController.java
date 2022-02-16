package com.usk.dmt.controllers;

import com.usk.dmt.constants.URIConstants;
import com.usk.dmt.models.Technology;
import com.usk.dmt.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(URIConstants.TECHNOLOGY)
public class TechnologyController {
    @Autowired
    TechnologyService service;

    @GetMapping("/")
    public ResponseEntity<List<Technology>> getTechnology(){
        return new ResponseEntity<>(service.getTechnologies(), HttpStatus.OK);
    }
}
