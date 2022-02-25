package com.usk.dmt.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the opportunity_tracker database table.
 */
@Entity
@Table(name = "opportunity_tracker")
@Data
public class OpportunityTracker extends CommonEntity<Integer> implements Serializable, BaseEntity<OpportunityTracker> {
    private static final long serialVersionUID = 1L;

    @Column(name = "category")
    private String category;

    @Column(name = "date")
    private String date;

    @Column(name = "paid")
    private String paid;

    @Column(name = "provided_by")
    private String providedBy;

    @Column(name = "provided_for")
    private String providedFor;

    @Column(name = "type")
    private String type;

}