package com.usk.dmt.controllers;

import com.usk.dmt.constants.URIConstants;
import com.usk.dmt.entities.Todo;
import com.usk.dmt.repository.TodoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(URIConstants.TODO)
public class TodoController extends BaseController<Todo> {
    public TodoController(TodoRepository repository) {
        super(repository);
    }
}