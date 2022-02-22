package com.usk.dmt.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the salary database table.
 */
@Entity
@Table(name = "salary")
@Data
public class Salary implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "description")
    private String description;

    @Column(name = "employee_id")
    private String employeeId;

    @Column(name = "month")
    private String month;

    @Column(name = "salary")
    private float salary;

    @Temporal(TemporalType.DATE)
    @Column(name = "updated_date")
    private Date updatedDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "year")
    private Date year;

}