package com.usk.dmt.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the course database table.
 */
@Entity
@Table(name = "course")
@Data
public class Course extends CommonEntity<Integer> implements Serializable, BaseEntity<Course>{
    private static final long serialVersionUID = 1L;

    @Column(name = "est_hrs")
    private int estHrs;

    //bi-directional many-to-one association to Technology
    @ManyToOne
    private Technology technology;


}