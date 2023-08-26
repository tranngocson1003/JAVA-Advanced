package com.vti;

import com.vti.dto.DepartmentDto;
import com.vti.entity.Department;
import com.vti.repository.DepartmentRepository;

import java.util.List;

public class DepartmentProgram {
    public static void main(String[] args) {
        DepartmentRepository repository = new DepartmentRepository();

        Department departmentA = new Department();
        departmentA.setName(" Giám đốc");
        repository.create(departmentA);

        Department departmentB = new Department();
        departmentB.setName(" Bảo vệ");
        repository.create(departmentB);

        Department departmentC = new Department();
        departmentC.setName(" Kinh doanh");
        repository.create(departmentC);

        Department departmentD = new Department();
        departmentD.setName(" Nhân sự");
        repository.create(departmentD);

        DepartmentDto findById = repository.findById(1);
        System.out.println("- findById = " + findById);

        List<Department> departments = repository.findAllUsingCriteria();
//        List<Department> departments = repository.findAll(2,2);
        for (Department department : departments){
            System.out.println("- Department = " + department);
        }
    }
}
