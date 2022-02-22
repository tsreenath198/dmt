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
public class Trainee implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "active_flag")
    private int activeFlag;

    @Column(name = "alternate_phone")
    private String alternatePhone;

    @Column(name = "batch_id")
    private int batchId;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "description")
    private String description;

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

    @Temporal(TemporalType.DATE)
    @Column(name = "updated_date")
    private Date updatedDate;

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