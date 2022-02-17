package com.usk.dmt.repository;

import com.usk.dmt.models.Technology;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TechnologyRepository extends CrudRepository<Technology, Integer> {

    List<Technology> findAllByActiveFlagAllIgnoreCaseOrderByIdAsc(int i);

    Optional<Technology> findByIdAndActiveFlag(Integer id, int i);

    Optional<List<Technology>> findByActiveFlag(int i);
}
