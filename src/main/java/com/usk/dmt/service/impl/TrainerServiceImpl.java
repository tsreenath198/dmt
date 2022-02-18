package com.usk.dmt.service.impl;


import com.usk.dmt.dao.TrainerDao;
import com.usk.dmt.entities.GenericResponse;
import com.usk.dmt.entities.Trainer;
import com.usk.dmt.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerServiceImpl implements TrainerService {
    @Autowired
    TrainerDao dao;

    @Override
    public List<Trainer> load() {
        return dao.get();
    }

    @Override
    public Trainer save(Trainer trainer) {
        return dao.save(trainer);
    }

    @Override
    public Trainer update(Trainer trainer) {
        return dao.update(trainer);
    }

    @Override
    public Trainer getById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public GenericResponse delete(Integer id) {
        return dao.delete(id);
    }
}
