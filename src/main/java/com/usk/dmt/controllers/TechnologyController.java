package com.usk.dmt.controllers;

import com.usk.dmt.constants.URIConstants;
import com.usk.dmt.models.GenericResponse;
import com.usk.dmt.models.Technology;
import com.usk.dmt.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(URIConstants.TECHNOLOGY)
public class TechnologyController {
    @Autowired
    TechnologyService service;

    @GetMapping
    public ResponseEntity<List<Technology>> load(){
        return new ResponseEntity<>(service.get(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Technology> save(@RequestBody Technology technology){
        return new ResponseEntity<>(service.save(technology),HttpStatus.OK);
    }
    @GetMapping("/id")
    public ResponseEntity<Technology> getById(@RequestParam Integer id) throws Exception {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Technology> update(@RequestBody Technology technology){
        return new ResponseEntity<>(service.update(technology),HttpStatus.OK);
    }
    @DeleteMapping
    public ResponseEntity<GenericResponse> delete(@RequestParam Integer id){
        return new ResponseEntity<>(service.delete(id),HttpStatus.OK);
    }
}
