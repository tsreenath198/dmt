package com.usk.dmt.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Table(name = "technology")
@Data
@Entity
public class Technology{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String description;

    @Column
    private Integer activeFlag=0;

    @Column
    @CreationTimestamp
    private Date createdDate;

    @Column
    @UpdateTimestamp
    private Date updatedDate;
    @Column
    private String name;
}
