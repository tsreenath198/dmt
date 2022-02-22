package com.usk.dmt.entities;

import lombok.Data;

import javax.persistence.*;

@Table
@Data
@Entity
public class Technology extends CommonEntity<Integer> implements BaseEntity<Technology> {
    @Column
    private String name;

    @Override
    public int getId(){
        return this.id;
    }
}
