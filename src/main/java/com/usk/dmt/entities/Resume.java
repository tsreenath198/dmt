package com.usk.dmt.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the resume database table.
 */
@Entity
@Table(name = "resume")
@Data
public class Resume implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_date")
    private Date createdDate;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(name = "description")
    private String description;

    @Column(name = "paid")
    private String paid;

    @Column(name = "prepared_by")
    private String preparedBy;

    @Column(name = "received_status")
    private String receivedStatus;

    @Column(name = "trainee_id")
    private String traineeId;

    @Temporal(TemporalType.DATE)
    @Column(name = "updated_date")
    private Date updatedDate;

}