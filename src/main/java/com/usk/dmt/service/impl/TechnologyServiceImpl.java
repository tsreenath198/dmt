package com.usk.dmt.service.impl;


import com.usk.dmt.dao.TechnologyDao;
import com.usk.dmt.models.GenericResponse;
import com.usk.dmt.models.Technology;
import com.usk.dmt.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TechnologyServiceImpl implements TechnologyService {
    @Autowired
    TechnologyDao dao;

    @Override
    public List<Technology> get() {
        return dao.get();
    }

    @Override
    public Technology save(Technology technology) {
        return dao.save(technology);
    }

    @Override
    public Technology update(Technology technology) {
        return dao.update(technology);
    }

    @Override
    public Technology getById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public GenericResponse delete(Integer id) {
        return dao.delete(id);
    }
}
