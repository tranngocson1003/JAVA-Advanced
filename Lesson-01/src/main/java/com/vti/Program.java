package com.vti;

import com.vti.entity.Department;
import com.vti.repository.DepartmentRepository;
import com.vti.utils.HibernateUtils;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        DepartmentRepository repository = new DepartmentRepository();

        Department departmentA = new Department();
        departmentA.setName("Giám đốc");
        departmentA.setType(Department.Type.PROJECT_MANAGER);
        repository.create(departmentA);

        Department departmentB = new Department();
        departmentB.setName("Bảo vệ");
        departmentB.setType(Department.Type.TESTER);
        repository.create(departmentB);

        List<Department> departments = repository.findAll();
        for (Department department : departments) {
            System.out.println("- department = " + department);
        }

        HibernateUtils.closeFactory();
    }
}
