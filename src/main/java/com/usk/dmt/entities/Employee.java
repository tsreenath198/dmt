package com.usk.dmt.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the employee database table.
 */
@Entity
@Table(name = "employee")
@Data
public class Employee extends CommonEntity<Integer> implements Serializable, BaseEntity<Employee> {
    private static final long serialVersionUID = 1L;

    @Column(name = "base_salary")
    private int baseSalary;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "role")
    private String role;

    //bi-directional many-to-one association to Interview
    @OneToMany(mappedBy = "employee")
    private List<Interview> interviews;

    //bi-directional many-to-one association to Todo
    @OneToMany(mappedBy = "employee")
    private List<Todo> todos;

}