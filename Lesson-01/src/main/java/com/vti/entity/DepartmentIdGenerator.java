package com.vti.entity;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

public class DepartmentIdGenerator implements IdentifierGenerator {
    @Override
    public Serializable generate(SharedSessionContractImplementor session , Object object) throws HibernateException {
        Department department = (Department) object;
        Department.Type type = department.getType();
        long count = session
                .createQuery("SELECT COUNT(id) FROM Department WHERE type = :type", Long.class)
                .setParameter("type", type)
                .uniqueResult();

        return type.toString().charAt(0) + "-" + (count + 1);
    }
}
