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
public class Todo extends CommonEntity<Integer> implements Serializable, BaseEntity<Todo> {
    private static final long serialVersionUID = 1L;

    @Column(name = "category")
    private String category;

    @Column(name = "estimated_time")
    private String estimatedTime;

    @Column(name = "status")
    private String status;

    @Temporal(TemporalType.DATE)
    @Column(name = "task_date")
    private Date taskDate;

    //bi-directional many-to-one association to Employee
    @ManyToOne
    @JoinColumn(name = "assigned_to")
    private Employee employee;

}