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
public class Note extends CommonEntity<Integer> implements Serializable, BaseEntity<Note> {
    private static final long serialVersionUID = 1L;

    @Column(name = "title")
    private String title;

    @Column(name = "user")
    private String user;

}