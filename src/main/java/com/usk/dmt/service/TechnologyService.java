package com.usk.dmt.service;

import com.usk.dmt.models.Technology;

import java.util.List;

public interface TechnologyService {
    List<Technology> get();

    Technology save(Technology technology);
}
