package com.vti.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", length = 50, nullable = false)
    private String Name;


    @OneToMany(mappedBy = "student")
//    @JoinTable(
//            name = "group_student",
//            joinColumns = @JoinColumn(name = "student_id", nullable = false),
//            inverseJoinColumns = @JoinColumn(name = "group_id", nullable = false)
//
//    )
    private List<Group> groups;

}
