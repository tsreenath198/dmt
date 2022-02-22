package com.usk.dmt.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the notes database table.
 */
@Entity
@Table(name = "notes")
@Data
public class Note implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "active_flag")
    private int activeFlag;

    @Column(name = "description")
    private String description;

    @Column(name = "title")
    private String title;

    @Column(name = "user")
    private String user;


}