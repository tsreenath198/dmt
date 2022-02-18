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
@Table
@Data
public class Trainer implements Serializable, BaseEntity<Trainer> {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "active_flag")
    private int activeFlag;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "description")
    private String description;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "referred_by")
    private String referredBy;

    @Temporal(TemporalType.DATE)
    @Column(name = "updated_date")
    private Date updatedDate;

    //bi-directional many-to-one association to Batch
    @OneToMany(mappedBy = "trainer")
    private List<Batch> batches;

    //bi-directional many-to-one association to Technology
    @ManyToOne
    private Technology technology;

    @Override
    public Integer getId(){
        return this.id;
    }
}
