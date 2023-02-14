package com.bandesal.demo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "blogs")
public class Blogs {
    @Getter @Setter @Column(name = "title")
    private String title;

    @Getter @Setter @Column(name = "description")
    private String description;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")

    private Integer id;

}
