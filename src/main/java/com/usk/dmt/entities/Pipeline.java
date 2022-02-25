package com.usk.dmt.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the pipeline database table.
 */
@Entity
@Table(name = "pipeline")
@Data
public class Pipeline extends CommonEntity<Integer> implements Serializable, BaseEntity<Pipeline> {
    private static final long serialVersionUID = 1L;

    @Column(name = "candidate_name")
    private String candidateName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "requirements")
    private String requirements;

}