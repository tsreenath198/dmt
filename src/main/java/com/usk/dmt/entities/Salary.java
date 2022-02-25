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
public class Salary extends CommonEntity<Integer> implements Serializable, BaseEntity<Salary> {
    private static final long serialVersionUID = 1L;

    @Column(name = "employee_id")
    private String employeeId;

    @Column(name = "month")
    private String month;

    @Column(name = "salary")
    private float salary;

    @Temporal(TemporalType.DATE)
    @Column(name = "year")
    private Date year;

}