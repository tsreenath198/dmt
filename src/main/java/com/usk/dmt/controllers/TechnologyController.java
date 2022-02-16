package com.usk.dmt.controllers;

import com.usk.dmt.constants.URIConstants;
import com.usk.dmt.models.Technology;
import com.usk.dmt.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(URIConstants.TECHNOLOGY)
public class TechnologyController {
    @Autowired
    TechnologyService service;

    @GetMapping
    public ResponseEntity<List<Technology>> get(){
        return new ResponseEntity<>(service.get(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Technology> save(@RequestBody Technology technology){
        return new ResponseEntity<>(service.save(technology),HttpStatus.OK);
    }
}
