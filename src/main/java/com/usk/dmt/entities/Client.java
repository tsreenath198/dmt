package com.usk.dmt.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the client database table.
 */
@Entity
@Table(name = "client")
@Data
public class Client  extends CommonEntity<Integer> implements Serializable, BaseEntity<Client> {
    private static final long serialVersionUID = 1L;

    @Column(name = "address")
    private String address;

    @Column(name = "name")
    private String name;

    //bi-directional many-to-one association to Contact
    @OneToMany(mappedBy = "client")
    private List<Contact> contacts;

    //bi-directional many-to-one association to Interview
    @OneToMany(mappedBy = "client")
    private List<Interview> interviews;

    //bi-directional many-to-one association to Trainee
    @OneToMany(mappedBy = "client")
    private List<Trainee> trainees;

}