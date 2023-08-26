package com.vti.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@ToString
@Entity
@Table(name = "department")
public class Department {
    @Id

//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id-generator")
//    @SequenceGenerator(
//            name = "id-generator",
//            sequenceName = "department_sequence",
//            initialValue = 5,
//            allocationSize = 1
//    )

//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @org.hibernate.annotations.Type(type = "uuid-char")
//    @Column(name = "id", nullable = false)

    @GeneratedValue(generator = "id-generator")
    @GenericGenerator(
            name = "id-generator",
            strategy = "com.vti.entity.DepartmentIdGenerator"
    )
    @Column(name = "id", length = 10, nullable = false)
    private String id;

    @Column(name = "name", length = 50, unique = true, nullable = false)
    private String name;

    @Column(name = "type", length = 15,nullable = false)
    @Convert(converter = DepartmentTypeConverter.class)
    private Type type;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @PrePersist
    public void prePersist() {
        System.out.println("PrePersist()");
    }

    public enum Type {
        DEVELOPER, TESTER, SCRUM_MASTER,PROJECT_MANAGER
    }
}
