package com.usk.dmt.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the todo database table.
 */
@Entity
@Table(name = "todo")
@Data
public class Todo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "active_flag")
    private int activeFlag;

    @Column(name = "category")
    private String category;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "description")
    private String description;

    @Column(name = "estimated_time")
    private String estimatedTime;

    @Column(name = "status")
    private String status;

    @Temporal(TemporalType.DATE)
    @Column(name = "task_date")
    private Date taskDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "updated_date")
    private Date updatedDate;

    //bi-directional many-to-one association to Employee
    @ManyToOne
    @JoinColumn(name = "assigned_to")
    private Employee employee;

}