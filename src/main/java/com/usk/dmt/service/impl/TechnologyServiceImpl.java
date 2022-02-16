package com.usk.dmt.service.impl;


import com.usk.dmt.dao.TechnologyDao;
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
}
