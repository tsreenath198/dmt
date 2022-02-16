package com.usk.dmt.dao.impl;

import com.usk.dmt.dao.TechnologyDao;
import com.usk.dmt.models.Technology;
import com.usk.dmt.repository.TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TechnologyDaoImpl implements TechnologyDao {
    @Autowired
    TechnologyRepository repository;
    @Override
    public List<Technology> get() {
        return (List<Technology>) repository.findAll();
    }
    @Override
    public Technology save(Technology technology) {
        return repository.save(technology);
    }
}
