package com.usk.dmt.controllers;

import com.usk.dmt.constants.URIConstants;
import com.usk.dmt.entities.Batch;
import com.usk.dmt.entities.Client;
import com.usk.dmt.repository.BatchRepository;
import com.usk.dmt.repository.ClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@Slf4j
@RequestMapping(URIConstants.CLIENT)
public class ClientController extends BaseController<Client> {

    private Logger logger = LoggerFactory.getLogger(BaseController.class);
    public ClientController(ClientRepository batchRepository) {
        super(batchRepository);
    }
}
