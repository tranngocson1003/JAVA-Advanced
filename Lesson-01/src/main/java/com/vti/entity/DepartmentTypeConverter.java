package com.vti.entity;

import javax.persistence.AttributeConverter;
import javax.persistence.Convert;

@Convert
public class DepartmentTypeConverter implements AttributeConverter<Department.Type, Character> {


    @Override
    public Character convertToDatabaseColumn(Department.Type type) {
        return type.toString().charAt(0);
    }

    @Override
    public Department.Type convertToEntityAttribute(Character code) {
        if (code == 'D' || code == 'd')
            return Department.Type.DEVELOPER;

        if (code == 'T' || code == 't')
            return Department.Type.TESTER;

        if (code == 'S' || code == 's')
                return Department.Type.SCRUM_MASTER;

        if (code == 'P' || code == 'p')
            return Department.Type.PROJECT_MANAGER;

        throw new UnsupportedOperationException("this code is unsupported");
    }
}

