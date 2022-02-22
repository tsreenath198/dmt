package com.usk.dmt.entities;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table
@Data
public class Batch extends CommonEntity<Integer> implements Serializable, BaseEntity<Batch> {
    private static final long serialVersionUID = 1L;

    @Column(name = "duration")
    private int duration;

    @Temporal(TemporalType.DATE)
    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "paid_status")
    private String paidStatus;

    @Column(name = "received_status")
    private String receivedStatus;

    @Temporal(TemporalType.DATE)
    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "status")
    private String status;

    @Column(name = "time")
    private String time;

    //bi-directional many-to-one association to Technology
    @ManyToOne
    private Technology technology;

    //bi-directional many-to-one association to Trainer
    @ManyToOne
    private Trainer trainer;

    @Override
    public int getId(){
        return this.id;
    }
}
