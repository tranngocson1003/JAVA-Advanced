package com.vti.Controller;

import com.vti.Entity.Department;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface IDepartmentController {
    @GetMapping
    Page<Department> findAll(Pageable pageable);

    @GetMapping("/{id}")
    Department findById(@PathVariable("id") Integer id);

    @GetMapping("/name/{name}")
    // api/v1/department/Giam doc
    Department findByName(@PathVariable("name") String name);

    @PostMapping
    void create(@RequestBody Department department);

    @PutMapping("/{id}")
    void update(@PathVariable("id") Integer id, @RequestBody Department department);

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable("id") Integer id);

    @DeleteMapping("/name/{name}")
    void deleteByName(@PathVariable("name") String name);
}
