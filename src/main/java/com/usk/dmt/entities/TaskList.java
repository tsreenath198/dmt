package com.usk.dmt.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the task_list database table.
 */
@Entity
@Table(name = "task_list")
@Data
public class TaskList {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private int taskId;

    @Column(name = "task_archived")
    private byte taskArchived;

    @Lob
    @Column(name = "task_description")
    private String taskDescription;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "task_end_time")
    private Date taskEndTime;

    @Column(name = "task_name")
    private String taskName;

    @Column(name = "task_priority")
    private String taskPriority;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "task_start_time")
    private Date taskStartTime;

    @Column(name = "task_status")
    private String taskStatus;

}