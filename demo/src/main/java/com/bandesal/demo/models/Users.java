package com.bandesal.demo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {
    @Getter @Setter @Column(name = "username")
    private String username;

    @Getter @Setter @Column(name = "password")
    private String password;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private Integer id;

}
