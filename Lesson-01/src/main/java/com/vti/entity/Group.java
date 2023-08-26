package com.vti.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "group")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", length = 50, unique = true, nullable = false)
    private String Name;

    @OneToMany(mappedBy = "group")
    private List<GroupStudent> groupStudents;


}


