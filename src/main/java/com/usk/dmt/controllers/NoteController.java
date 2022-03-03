package com.usk.dmt.controllers;

import com.usk.dmt.constants.URIConstants;
import com.usk.dmt.entities.Note;
import com.usk.dmt.repository.NoteRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(URIConstants.INVOICE)
public class NoteController extends BaseController<Note> {
    public NoteController(NoteRepository repository) {
        super(repository);
    }
}
