package com.usk.dmt.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Table
@Data
@Entity
public class Technology implements BaseEntity<Technology> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String description;

    @Column(name = "active_flag")
    private Integer activeFlag=0;

    @Column(name = "created_date")
    @CreationTimestamp
    private Date createdDate;

    @Column(name = "updated_date")
    @UpdateTimestamp
    private Date updatedDate;
    @Column
    private String name;

    @Override
    public Integer getId(){
        return this.id;
    }
}
