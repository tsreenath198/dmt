package com.usk.dmt.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the trainee database table.
 */
@Entity
@Table(name = "trainee")
@Data
public class Trainee extends CommonEntity<Integer> implements Serializable, BaseEntity<Trainee> {
    private static final long serialVersionUID = 1L;

    @Column(name = "alternate_phone")
    private String alternatePhone;

    @Column(name = "batch_id")
    private int batchId;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "paid_status")
    private String paidStatus;

    @Column(name = "phone")
    private String phone;

    @Column(name = "received_status")
    private String receivedStatus;

    @Column(name = "skype_id")
    private String skypeId;

    @Column(name = "technology_id")
    private int technologyId;

    @Column(name = "timezone")
    private String timezone;

    @Column(name = "trainee_fee_status")
    private String traineeFeeStatus;

    //bi-directional many-to-one association to Interview
    @OneToMany(mappedBy = "trainee")
    private List<Interview> interviews;

    //bi-directional many-to-one association to Support
    @OneToMany(mappedBy = "trainee")
    private List<Support> supports;

    //bi-directional many-to-one association to Client
    @ManyToOne
    private Client client;


}