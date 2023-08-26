package com.vti.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;


@Getter
@Setter
@ToString
@Embeddable
public class GroupStudentPK implements Serializable {
    @Column(name = "student_id", nullable = false)
    private int studentId;

    @Column(name = "group_id", nullable = false, updatable = false)
    private int groupId;
}
