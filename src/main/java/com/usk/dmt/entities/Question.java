package com.usk.dmt.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the question database table.
 */
@Entity
@Table(name = "question")
@Data
public class Question implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "active_flag")
    private int activeFlag;

    @Column(name = "answers")
    private String answers;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "description")
    private String description;

    @Column(name = "end_client")
    private String endClient;

    @Column(name = "question")
    private String question;

    @Temporal(TemporalType.DATE)
    @Column(name = "updated_date")
    private Date updatedDate;


}