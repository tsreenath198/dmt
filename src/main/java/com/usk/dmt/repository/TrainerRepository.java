package com.usk.dmt.repository;

import com.usk.dmt.entities.Trainer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TrainerRepository extends CrudRepository<Trainer, Integer> {

    List<Trainer> findAllByActiveFlagAllIgnoreCaseOrderByIdAsc(int i);

    Optional<Trainer> findByIdAndActiveFlag(Integer id, int i);

    Optional<List<Trainer>> findByActiveFlag(int i);
}
