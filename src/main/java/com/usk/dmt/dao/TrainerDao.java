package com.usk.dmt.dao;

import com.usk.dmt.entities.GenericResponse;
import com.usk.dmt.entities.Technology;
import com.usk.dmt.entities.Trainer;

import java.util.List;

public interface TrainerDao {
    List<Trainer> get();

    Trainer save(Trainer trainer);

    Trainer update(Trainer trainer);

    Trainer getById(Integer id);

    GenericResponse delete(Integer id);
}
