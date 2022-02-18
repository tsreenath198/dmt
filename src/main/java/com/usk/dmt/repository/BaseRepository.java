package com.usk.dmt.repository;

import com.usk.dmt.entities.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity<T>> extends JpaRepository<T,Integer> { }