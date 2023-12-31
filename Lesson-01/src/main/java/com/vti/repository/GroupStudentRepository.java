package com.vti.repository;

import com.vti.entity.Department;
import com.vti.entity.GroupStudent;
import com.vti.utils.HibernateUtils;
import org.hibernate.Session;

import java.util.List;

public class GroupStudentRepository {
    public List<GroupStudent> findAll() {
        try (Session session = HibernateUtils.openSession()) {
            return session
                    .createQuery("FROM GroupStudent", GroupStudent.class)
                    .getResultList();
        }
    }
    public void create(GroupStudent department) {
        try (Session session = HibernateUtils.openSession()) {
            session.beginTransaction();
            session.persist(department);
            session.getTransaction().commit();
        }
    }
}
