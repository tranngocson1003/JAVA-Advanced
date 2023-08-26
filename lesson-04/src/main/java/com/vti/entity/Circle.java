package com.vti.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.Value;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity

//@DiscriminatorValue(value = "C")
@Table(name = "circle")
//@AttributeOverrides(
//        value = {
//                @AttributeOverride(name = "id", column = @Column(name = "id")),
//                @AttributeOverride(
//                        name = "name",
//                        column = @Column(name = "name", length = 50, unique = true, nullable = false)
//                ),
//                @AttributeOverride(
//                        name = "color",
//                        column = @Column(name = "color", length = 50, nullable = false)
//                )
//        }
//)
//@PrimaryKeyJoinColumn(name = "id")

public class Circle extends Shape{
    @Column(name = "radius", nullable = false)
    private int radius;
}
