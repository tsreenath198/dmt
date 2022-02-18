package com.usk.dmt.controllers;

import com.usk.dmt.entities.BaseEntity;
import com.usk.dmt.repository.BaseRepository;
import com.usk.dmt.service.BaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

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

}
