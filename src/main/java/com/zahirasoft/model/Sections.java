package com.zahirasoft.model;

import javax.persistence.*;

@Entity
@Table(name = "sections")
public class Sections {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idSection")
    private Long idSection;

    @Column(name = "section")
    private String section;
}
