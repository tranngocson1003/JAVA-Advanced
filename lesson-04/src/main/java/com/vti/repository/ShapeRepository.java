package com.vti.repository;


import com.vti.entity.Circle;
import com.vti.entity.Rectangle;
import com.vti.entity.Shape;
import com.vti.utils.HibernateUtils;
import org.hibernate.Session;
import java.util.List;

public class ShapeRepository {
    public List<Circle> findAllCircle(){
        try (Session session = HibernateUtils.openSession()){
            return session
                    .createQuery("FROM Circle", Circle.class)
                    .getResultList();
        }
    }

    public List<Rectangle> findAllRectangle(){
        try (Session session = HibernateUtils.openSession()){
            return session
                    .createQuery("FROM Rectangle", Rectangle.class)
                    .getResultList();
        }
    }

    public void createShape(Shape shape){
        try (Session session = HibernateUtils.openSession()){
            session.beginTransaction();
            session.persist(shape);
            session.getTransaction().commit();
        }
    }
}
