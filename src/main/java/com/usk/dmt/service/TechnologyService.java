package com.usk.dmt.service;


import com.usk.dmt.models.GenericResponse;
import com.usk.dmt.models.Technology;

import java.util.List;

public interface TechnologyService {
    List<Technology> get();

    Technology save(Technology technology);

    Technology update(Technology technology);

    Technology getById(Integer id);

    GenericResponse delete(Integer id);
}
