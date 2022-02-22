package com.usk.dmt.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the invoice database table.
 */
@Entity
@Table(name = "invoice")
@Data
public class Invoice implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "active_flag")
    private int activeFlag;

    @Column(name = "actual_amount")
    private float actualAmount;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "description")
    private String description;

    @Column(name = "invoice_no")
    private int invoiceNo;

    @Column(name = "received_amount")
    private float receivedAmount;

    @Temporal(TemporalType.DATE)
    @Column(name = "received_date")
    private Date receivedDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "support_end_date")
    private Date supportEndDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "support_start_date")
    private Date supportStartDate;

    @Column(name = "trainee_id")
    private int traineeId;

    @Temporal(TemporalType.DATE)
    @Column(name = "updated_date")
    private Date updatedDate;

}