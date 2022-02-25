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
public class Question extends CommonEntity<Integer> implements Serializable, BaseEntity<Question> {
    private static final long serialVersionUID = 1L;

    @Column(name = "answers")
    private String answers;

    @Column(name = "end_client")
    private String endClient;

    @Column(name = "question")
    private String question;
}