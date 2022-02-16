package com.usk.dmt.repository;

import com.usk.dmt.models.Technology;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TechnologyRepository extends CrudRepository<Technology, Integer> {

    List<Technology> findAllByActiveFlagAllIgnoreCaseOrderByIdAsc(int i);
}
