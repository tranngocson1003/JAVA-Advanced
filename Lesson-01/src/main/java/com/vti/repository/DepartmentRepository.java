package com.vti.repository;

import com.vti.entity.Department;
import com.vti.utils.HibernateUtils;
import org.hibernate.Session;

import java.util.List;

public class DepartmentRepository {
    public List<Department> findAll() {
        try (Session session = HibernateUtils.openSession()) {
            return session
                    .createQuery("FROM Department", Department.class)
                    .getResultList();
        }
    }

    public Department findById(int id) {
        try (Session session = HibernateUtils.openSession()) {
            return session.get(Department.class, id);
        }
    }

    public Department findByName(String name) {
        try (Session session = HibernateUtils.openSession()) {
            return session
                    .createQuery("FROM Department WHERE name = :name", Department.class)
                    .setParameter("name", name)
                    .uniqueResult();
        }
    }

    public void create(Department department) {
        try (Session session = HibernateUtils.openSession()) {
            session.beginTransaction();
            session.persist(department);
            session.getTransaction().commit();
        }
    }

    public void update(Department department) {
        try (Session session = HibernateUtils.openSession()) {
            session.beginTransaction();
            session.merge(department);
            session.getTransaction().commit();
        }
    }

    public void deleteById(int id) {
        try (Session session = HibernateUtils.openSession()) {
            session.beginTransaction();
            Department old = session.get(Department.class, id);
            session.remove(old);
            session.getTransaction().commit();
        }
    }

    public void deleteByName(String name) {
        try (Session session = HibernateUtils.openSession()) {
            session.beginTransaction();
            Department old = findByName(name);
            session.remove(old);
            session.getTransaction().commit();
        }
    }

    public boolean existsById(int id) {
        return findById(id) != null;
    }

    public boolean existsByName(String name) {
        return findByName(name) != null;
    }
}
