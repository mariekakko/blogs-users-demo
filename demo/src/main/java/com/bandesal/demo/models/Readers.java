package com.bandesal.demo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "readers")
public class Readers {

    @Getter @Setter @Column(name = "name")
    private String name;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")

    private Integer id;

}
