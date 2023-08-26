package com.vti.Service;

import com.vti.Entity.Department;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IDepartmentService {
    Page<Department> findAll(Pageable pageable);

    Department findById(Integer id);

    Department findByName(String name);

    void create(Department department);

    void update(Department department);

    void deleteById(Integer id);

    void deleteByName(String name);

}
