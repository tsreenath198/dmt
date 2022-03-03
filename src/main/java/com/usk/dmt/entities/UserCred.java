package com.usk.dmt.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the user_creds database table.
 */
@Entity
@Table(name = "user_creds")
@Data
public class UserCred extends CommonEntity<Integer> implements Serializable, BaseEntity<UserCred> {
    private static final long serialVersionUID = 1L;

    @Column(name = "email")
    private String email;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "password")
    private String password;

   // @Column(name = "confirm_password")
   // private String confirmPassword;

    @Column(name = "phoneno")
    private String phoneno;

    @Column(name = "role")
    private String role;

    @Column(name = "username")
    private String username;

  //  @Column(name = "address")
  //  private String address;
}