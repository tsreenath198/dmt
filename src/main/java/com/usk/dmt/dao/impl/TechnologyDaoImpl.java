package com.usk.dmt.dao.impl;

import com.usk.dmt.dao.TechnologyDao;
import com.usk.dmt.models.GenericResponse;
import com.usk.dmt.models.Technology;
import com.usk.dmt.repository.TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@Component
public class TechnologyDaoImpl implements TechnologyDao {
    @Autowired
    TechnologyRepository repository;

    @Override
    public List<Technology> get() {
        return repository.findByActiveFlag(0).get();
    }
    @Override
    public Technology save(Technology technology) {
        return repository.save(technology);
    }

    @Override
    public Technology update(Technology tech) {
        repository.findByIdAndActiveFlag(tech.getId(), 0)
                .orElseThrow(()->new HttpClientErrorException(HttpStatus.BAD_REQUEST,"Invalid Technology id: "+tech.getId()));
        return repository.save(tech);
    }

    @Override
    public Technology getById(Integer id) {
        return repository.findByIdAndActiveFlag(id, 0)
                .orElseThrow(()->new HttpClientErrorException(HttpStatus.BAD_REQUEST,"Invalid Technology id: "+id));
    }

    @Override
    public GenericResponse delete(Integer id) {
        Technology technology = repository.findByIdAndActiveFlag(id,0)
                .orElseThrow(()->new HttpClientErrorException(HttpStatus.BAD_REQUEST,"Invalid Technology id: "+id));
        technology.setActiveFlag(1);
        repository.save(technology);
        return getGenericResponse("Successfully deleted Technology with id:"+id);
    }

    private GenericResponse getGenericResponse(String message){
        GenericResponse gr = new GenericResponse();
        gr.setMessage(message);
        gr.setStatus(HttpStatus.OK.getReasonPhrase());
        return  gr;
    }
}
