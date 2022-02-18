package com.usk.dmt.service;

import com.usk.dmt.entities.GenericResponse;
import com.usk.dmt.entities.Trainer;

import java.util.List;

public interface TrainerService {
    List<Trainer> load();

    Trainer save(Trainer trainer);

    Trainer getById(Integer id);

    Trainer update(Trainer trainer);

    GenericResponse delete(Integer id);
}
