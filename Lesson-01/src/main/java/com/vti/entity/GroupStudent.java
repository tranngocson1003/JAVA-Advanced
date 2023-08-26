package com.vti.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "group_student")
public class GroupStudent {

//    @EmbeddedId
//    private GroupStudentPK pk;

//    @Id
//    @Column(name = "student_id", nullable = false)
//    private int studentId;
//
//    @Id
//    @Column(name = "group_id",nullable = false)
//    private int groupId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")

    private int id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "student_id",nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "group_id",nullable = false)
    private Group group;


    @CreationTimestamp
    @Column(name = "joiner_date", nullable = false, updatable = false)
    private LocalDate joinedDate;
}
