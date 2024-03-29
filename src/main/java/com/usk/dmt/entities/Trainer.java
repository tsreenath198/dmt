package com.usk.dmt.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the trainer database table.
 */
@Entity
@Table(name = "trainer")
@Data
public class Trainer extends CommonEntity<Integer> implements Serializable, BaseEntity<Trainer> {
    private static final long serialVersionUID = 1L;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "referred_by")
    private String referredBy;

    //bi-directional many-to-one association to Batch
    @OneToMany(mappedBy = "trainer")
    private List<Batch> batches;

    //bi-directional many-to-one association to Technology
    @ManyToOne
    private Technology technology;

    @Override
    public int getId(){
        return this.id;
    }
}
