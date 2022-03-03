package com.usk.dmt.service;

import com.usk.dmt.entities.BaseEntity;
import com.usk.dmt.repository.BaseRepository;
import org.hibernate.annotations.NotFound;

import javax.transaction.Transactional;
import java.util.List;

public abstract class BaseService<T extends BaseEntity<T>> {
    private final BaseRepository<T> repository;

    public BaseService(BaseRepository<T> repository) {
        this.repository = repository;
    }

    public List<T> load(){
       return repository.findAll();
    }

    public T get(Integer id){
        return repository.findById(id).get();
    }

    @Transactional
    public T update(T updated){
        T dbDomain = get(updated.getId());
        return repository.save(dbDomain);
    }

    @Transactional
    public T create(T newDomain){
        return repository.save(newDomain);
    }

    @Transactional
    public void delete(Integer id){
        //check if object with this id exists
        get(id);
        repository.deleteById(id);
    }

}
