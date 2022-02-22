package com.usk.dmt.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the interview database table.
 */
@Entity
@Table(name = "interview")
@Data
public class Interview implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "active_flag")
    private int activeFlag;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_date")
    private Date createdDate;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(name = "description")
    private String description;

    @Column(name = "interviewer")
    private String interviewer;

    @Column(name = "paid_status")
    private String paidStatus;

    @Column(name = "received_status")
    private String receivedStatus;

    @Column(name = "status")
    private String status;

    @Column(name = "time")
    private String time;

    @Temporal(TemporalType.DATE)
    @Column(name = "updated_date")
    private Date updatedDate;

    //bi-directional many-to-one association to Client
    @ManyToOne
    private Client client;

    //bi-directional many-to-one association to Employee
    @ManyToOne
    @JoinColumn(name = "assisted_by")
    private Employee employee;

    //bi-directional many-to-one association to Trainee
    @ManyToOne
    private Trainee trainee;

}