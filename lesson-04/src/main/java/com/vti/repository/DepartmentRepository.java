package com.vti.repository;

import com.vti.dto.DepartmentDto;
import com.vti.entity.Circle;
import com.vti.entity.Department;
import com.vti.utils.HibernateUtils;
import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class DepartmentRepository {

    public List<Department> findAllUsingCriteria(){

        try
            (Session session = HibernateUtils.openSession()){
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Department> cr = cb.createQuery(Department.class);
            Root<Department> root = cr.from(Department.class);
            cr.select(root);
            return session
                    .createQuery(cr)
                    .getResultList();
        }
    }

    public List<Department> findAllUsingSQL(){
        try (Session session = HibernateUtils.openSession()){
            return session
                    .createNativeQuery("SELECT * FROM department", Department.class)
                    .getResultList();
        }
    }

    public List<Department> findAll(int page, int size){
            try (Session session = HibernateUtils.openSession()){
                return session
                        .createQuery("FROM Department", Department.class)
                        .setFirstResult((page - 1) * size)
                        .setMaxResults(size)
                        .getResultList();

        }
// 1000 -> 100 page, size 10
//        1: 1->10
//        2: 11->20
//        5: 41->50
//
    }
    public List<Department> findAll(){
        try (Session session = HibernateUtils.openSession()){
            return session
                    .createQuery("FROM Department", Department.class)
                    .getResultList();
        }
    }
    public DepartmentDto findById(int id){
        try (Session session = HibernateUtils.openSession()){
            return session
                    .createQuery("SELECT new com.vti.dto.DepartmentDto(name) FROM Department WHERE id= :id",DepartmentDto.class)
                    .setParameter("id", id)
                    .uniqueResult();
        }
    }

    public void create(Department department) {
        try (Session session = HibernateUtils.openSession()){
            session.beginTransaction();
            session.persist(department);
            session.getTransaction().commit();
        }
    }
}
