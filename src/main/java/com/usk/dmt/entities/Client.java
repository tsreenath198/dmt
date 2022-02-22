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
public class Client implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private int id;

    @Column(name = "active_flag")
    private int activeFlag;

    @Column(name = "address")
    private String address;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "description")
    private String description;

    @Column(name = "name")
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "updated_date")
    private Date updatedDate;

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