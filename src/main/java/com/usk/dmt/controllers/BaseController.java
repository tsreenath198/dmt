package com.usk.dmt.controllers;

import com.usk.dmt.entities.BaseEntity;
import com.usk.dmt.repository.BaseRepository;
import com.usk.dmt.service.BaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class BaseController<T extends BaseEntity<T>> {

    private BaseService<T> service;

    public BaseController(BaseRepository<T> repository) {
        this.service = new BaseService<T>(repository) {};
    }

    @GetMapping
    public ResponseEntity<List<T>> load(){
        return ResponseEntity.ok(service.load());
    }

    @GetMapping("/id")
    public ResponseEntity<T> get(@RequestParam Integer id){
        return ResponseEntity.ok(service.get(id));
    }
    @PostMapping
    public ResponseEntity<T> save(@RequestBody T payload){
        return ResponseEntity.ok(service.create(payload));
    }
    @PutMapping
    public ResponseEntity<T> update(@RequestBody T payload){
        return ResponseEntity.ok(service.update(payload));
    }
    @DeleteMapping
    public ResponseEntity<String> delete(@RequestParam Integer payload){
        service.delete(payload);
        return ResponseEntity.ok(HttpStatus.OK.getReasonPhrase());
    }
}
