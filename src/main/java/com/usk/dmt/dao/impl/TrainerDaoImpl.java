package com.usk.dmt.dao.impl;

import com.usk.dmt.dao.TrainerDao;
import com.usk.dmt.dao.TrainerDao;
import com.usk.dmt.entities.GenericResponse;
import com.usk.dmt.entities.Trainer;
import com.usk.dmt.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@Component
public class TrainerDaoImpl implements TrainerDao {
    @Autowired
    TrainerRepository repository;

    @Override
    public List<Trainer> get() {
        return repository.findByActiveFlag(0).get();
    }
    @Override
    public Trainer save(Trainer trainer) {
        return repository.save(trainer);
    }

    @Override
    public Trainer update(Trainer trainer) {
        repository.findByIdAndActiveFlag(trainer.getId(), 0)
                .orElseThrow(()->new HttpClientErrorException(HttpStatus.BAD_REQUEST,"Invalid Trainer id: "+trainer.getId()));
        return repository.save(trainer);
    }

    @Override
    public Trainer getById(Integer id) {
        return repository.findByIdAndActiveFlag(id, 0)
                .orElseThrow(()->new HttpClientErrorException(HttpStatus.BAD_REQUEST,"Invalid Trainer id: "+id));
    }

    @Override
    public GenericResponse delete(Integer id) {
        Trainer technology = repository.findByIdAndActiveFlag(id,0)
                .orElseThrow(()->new HttpClientErrorException(HttpStatus.BAD_REQUEST,"Invalid Trainer id: "+id));
        technology.setActiveFlag(1);
        repository.save(technology);
        return getGenericResponse("Successfully deleted Trainer with id:"+id);
    }

    private GenericResponse getGenericResponse(String message){
        GenericResponse gr = new GenericResponse();
        gr.setMessage(message);
        gr.setStatus(HttpStatus.OK.getReasonPhrase());
        return  gr;
    }
}
