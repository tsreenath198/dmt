package com.usk.dmt.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the support database table.
 */
@Entity
@Table(name = "support")
@Data
public class Support implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "active_flag")
    private int activeFlag;

    @Column(name = "allotted_time")
    private String allottedTime;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "description")
    private String description;

    @Column(name = "end_client")
    private String endClient;

    @Temporal(TemporalType.DATE)
    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "paid_by")
    private String paidBy;

    @Column(name = "paid_status")
    private String paidStatus;

    @Column(name = "received_status")
    private String receivedStatus;

    @Temporal(TemporalType.DATE)
    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "status")
    private String status;

    @Column(name = "supported_by")
    private int supportedBy;

    @Column(name = "technology_used")
    private String technologyUsed;

    @Column(name = "trainer_id")
    private int trainerId;

    @Temporal(TemporalType.DATE)
    @Column(name = "updated_date")
    private Date updatedDate;

    //bi-directional many-to-one association to Trainee
    @ManyToOne
    private Trainee trainee;

}