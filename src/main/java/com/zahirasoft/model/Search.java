package com.zahirasoft.model;

import javax.persistence.*;

@Entity
@Table(name = "search")
public class Search {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idSearch")
    private Long idSearch;

    @Column(name = "description")
    private String description;

}
