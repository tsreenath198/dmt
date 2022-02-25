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
public class Resume extends CommonEntity<Integer> implements Serializable, BaseEntity<Resume> {
    private static final long serialVersionUID = 1L;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(name = "paid")
    private String paid;

    @Column(name = "prepared_by")
    private String preparedBy;

    @Column(name = "received_status")
    private String receivedStatus;

    @Column(name = "trainee_id")
    private String traineeId;

}