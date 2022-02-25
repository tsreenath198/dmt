package com.usk.dmt.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the contact database table.
 */
@Entity
@Table(name = "contact")
@Data
public class Contact  extends CommonEntity<Integer> implements Serializable, BaseEntity<Contact> {
    private static final long serialVersionUID = 1L;

    @Column(name = "designation")
    private String designation;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "poc")
    private String poc;

    //bi-directional many-to-one association to Client
    @ManyToOne
    private Client client;


}