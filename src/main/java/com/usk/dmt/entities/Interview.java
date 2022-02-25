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
public class Interview extends CommonEntity<Integer> implements Serializable, BaseEntity<Interview> {
    private static final long serialVersionUID = 1L;

    @Temporal(TemporalType.DATE)
    private Date date;

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