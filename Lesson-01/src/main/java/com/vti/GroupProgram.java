package com.vti;

import com.vti.entity.Group;
import com.vti.entity.GroupStudent;
import com.vti.entity.Student;
import com.vti.repository.GroupRepository;
import com.vti.repository.GroupStudentRepository;

import java.util.Arrays;
import java.util.List;

public class GroupProgram {
    public static void main(String[] args) {
        GroupStudentRepository repository = new GroupStudentRepository();

        Group group = new Group();
        group.setName("Java Advanced");

        Student studentA = new Student();
        studentA.setName("Tran Ngoc Son");

        Student studentB = new Student();
        studentB.setName("Nguyen van A");

        GroupStudent groupStudent = new GroupStudent();
        groupStudent.setStudent(studentA);
        groupStudent.setGroup(group);
        repository.create(groupStudent);

        GroupStudent groupStudentB = new GroupStudent();
        groupStudentB.setStudent(studentB);
        groupStudentB.setGroup(group);
        repository.create(groupStudentB);

    }
}

