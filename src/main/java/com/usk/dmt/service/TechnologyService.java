package com.usk.dmt.service;


import com.usk.dmt.entities.GenericResponse;
import com.usk.dmt.entities.Technology;

import java.util.List;

public interface TechnologyService {
    List<Technology> get();

    Technology save(Technology technology);

    Technology update(Technology technology);

    Technology getById(Integer id);

    GenericResponse delete(Integer id);
}
