package com.usk.dmt.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the support_interaction database table.
 */
@Entity
@Table(name = "support_interaction")
@Data
public class SupportInteraction implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "count")
    private int count;

    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;

    @Column(name = "lead")
    private String lead;

    @Column(name = "lead_id")
    private int leadId;

    @Column(name = "trainee_id")
    private int traineeId;

    @Column(name = "trainer_id")
    private int trainerId;


}