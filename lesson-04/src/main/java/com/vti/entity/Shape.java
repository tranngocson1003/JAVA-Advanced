package com.vti.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Getter
@Setter
@ToString
//@Entity
@Table(name = "shape")

//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "type", length = 1)


//@Inheritance(strategy = InheritanceType.JOINED)
@MappedSuperclass
public abstract class Shape {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected int id;

    @Column(name = "name", length = 50, unique = true, nullable = false)
    protected String name;


    @Column(name = "color", length = 50, nullable = false)
    protected String color;

}
