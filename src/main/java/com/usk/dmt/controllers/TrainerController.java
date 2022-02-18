package com.usk.dmt.controllers;

import com.usk.dmt.constants.URIConstants;
import com.usk.dmt.entities.GenericResponse;
import com.usk.dmt.entities.Technology;
import com.usk.dmt.entities.Trainer;
import com.usk.dmt.service.TechnologyService;
import com.usk.dmt.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(URIConstants.TRAINER)
public class TrainerController {
    @Autowired
    TrainerService service;
    @GetMapping
    public ResponseEntity<List<Trainer>> load(){
        return new ResponseEntity<>(service.load(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Trainer> save(@RequestBody Trainer trainer){
        return new ResponseEntity<>(service.save(trainer),HttpStatus.OK);
    }
    @GetMapping("/id")
    public ResponseEntity<Trainer> getById(@RequestParam Integer id){
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<Trainer> update(@RequestBody Trainer trainer){
        return new ResponseEntity<>(service.update(trainer),HttpStatus.OK);
    }
    @DeleteMapping
    public ResponseEntity<GenericResponse> delete(@RequestParam Integer id){
        return new ResponseEntity<>(service.delete(id),HttpStatus.OK);
    }
}
