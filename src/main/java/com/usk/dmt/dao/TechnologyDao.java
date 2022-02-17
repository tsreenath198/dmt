package com.usk.dmt.dao;


import com.usk.dmt.entities.GenericResponse;
import com.usk.dmt.entities.Technology;

import java.util.List;

public interface TechnologyDao {
    List<Technology> get();

    Technology save(Technology technology);

    Technology update(Technology technology);

    Technology getById(Integer id);

    GenericResponse delete(Integer id);
}
